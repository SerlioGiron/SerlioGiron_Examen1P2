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
        
        String binario = Integer.toBinaryString(numero);
        
        int length = binario.length();
        
        if (!binario.equals("255")) 
        {
            for (int i = 0; i < 8-length; i++) 
            {
                temporal += "0";
            }
        }
        
        temporal += binario;
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
