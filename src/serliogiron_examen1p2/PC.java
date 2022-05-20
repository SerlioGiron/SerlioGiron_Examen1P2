/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_examen1p2;

/**
 *
 * @author usuario
 */
public class PC {
    private String ip;
    private String mascara;
    private String hostname;
    private String ipbin;
    private String maskbin;

    public PC() {
    }

    public PC(String ip, String mascara, String hostname) {
        this.ip = ip;
        this.mascara = mascara;
        this.hostname = hostname;
        
        String [] tokens = ip.split("\\.");
        
        this.ipbin = bin(Integer.parseInt(tokens[0])) + "." + bin(Integer.parseInt(tokens[1])) + "." + bin(Integer.parseInt(tokens[2])) + "." + bin(Integer.parseInt(tokens[3]));
        
        String [] t = mascara.split("\\.");
        
        this.maskbin = bin(Integer.parseInt(t[0])) + "." + bin(Integer.parseInt(t[1])) + "." + bin(Integer.parseInt(t[2])) + "." + bin(Integer.parseInt(t[3]));
    }

    public String getMaskbin() {
        return maskbin;
    }

    public void setMaskbin(String maskbin) {
        this.maskbin = maskbin;
    }

    
    
    public String getIpbin() {
        return ipbin;
    }

    public void setIpbin(String ipbin) {
        this.ipbin = ipbin;
    }
    
    
    
    public String bin(int numero)
    {
        String temporal = "";
        
        if(numero == 0)
        {
            for (int i = 0; i < 8; i++) 
            {
                temporal += "0";
            }
        }
        else if(numero == 1)
        {
            for (int i = 0; i < 7; i++) 
            {
                temporal += "0";
            }
            
            temporal += "1";
        }
        else if (numero == 2 || numero == 3)
        {
            for (int i = 0; i < 6; i++) 
            {
                temporal += "0";
            }
            
            //int division = numero / 2;
            int cont = 8-1;
            for (int i = 0; i < 2; i++) 
            {
                if(numero % 2 == 0)
                {
                    temporal += "0";
                }
                else
                {
                    temporal += "1";
                }
                
                numero = numero / 2;
                
                cont--;
            }
            
        }
        else if (numero >= 4 && numero <= 7)
        {
            for (int i = 0; i < 5; i++) 
            {
                temporal += "0";
            }
            
            //int division = numero / 2;
            int cont = 8-1;
            for (int i = 0; i < 3; i++) 
            {
                if(numero % 2 == 0)
                {
                    temporal += "0";
                }
                else
                {
                    temporal += "1";
                }
                
                numero = numero / 2;
                
                cont--;
            }
            
        }
        else if (numero >= 8 && numero <= 15)
        {
            for (int i = 0; i < 4; i++) 
            {
                temporal += "0";
            }
            
            //int division = numero / 2;
            int cont = 8-1;
            for (int i = 0; i < 4; i++) 
            {
                if(numero % 2 == 0)
                {
                    temporal += "0";
                }
                else
                {
                    temporal += "1";
                }
                
                numero = numero / 2;
                
                cont--;
            }
            
        }
        else if (numero >= 16 && numero <= 31)
        {
            for (int i = 0; i < 3; i++) 
            {
                temporal += "0";
            }
            
            //int division = numero / 2;
            int cont = 8-1;
            for (int i = 0; i < 5; i++) 
            {
                if(numero % 2 == 0)
                {
                    temporal += "0";
                }
                else
                {
                    temporal += "1";
                }
                
                numero = numero / 2;
                
                cont--;
            }
            
        }
        else if (numero >= 32 && numero <= 63)
        {
            for (int i = 0; i < 2; i++) 
            {
                temporal += "0";
            }
            
            //int division = numero / 2;
            int cont = 8-1;
            for (int i = 0; i < 6; i++) 
            {
                if(numero % 2 == 0)
                {
                    temporal += "0";
                }
                else
                {
                    temporal += "1";
                }
                
                numero = numero / 2;
                
                cont--;
            }
            
        }
        else if (numero >= 64 && numero <= 127)
        {
            for (int i = 0; i < 1; i++) 
            {
                temporal += "0";
            }
            
            //int division = numero / 2;
            int cont = 8-1;
            for (int i = 0; i < 7; i++) 
            {
                if(numero % 2 == 0)
                {
                    temporal += "0";
                }
                else
                {
                    temporal += "1";
                }
                
                numero = numero / 2;
                
                cont--;
            }
            
        }
        else if (numero >= 128)
        {
            for (int i = 0; i < 0; i++) 
            {
                temporal += "0";
            }
            
            //int division = numero / 2;
            int cont = 8-1;
            for (int i = 0; i < 8; i++) 
            {
                if(numero % 2 == 0)
                {
                    temporal += "0";
                }
                else
                {
                    temporal += "1";
                }
                
                numero = numero / 2;
                
                cont--;
            }
            
        }
        
        return temporal;
    }

    
    
    @Override
    public String toString() {
        return "PC{" + "ip=" + ip + ", mascara=" + mascara + ", hostname=" + hostname + '}';
    }
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    
}
