/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_examen1p2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SerlioGiron_Examen1P2 {
static Scanner lea = new Scanner(System.in);
static Random random = new Random();
static PC seleccionada = new PC();

static ArrayList <PC> PCs = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 1;
        while (menu != 0) 
        {
            System.out.println("");
            System.out.println("0. Salir\n"
                    + "1. PC\n"
                    + "2. Ingresar PC\n");
            System.out.print("Ingrese una Opción: ");
            menu = lea.nextInt();
            System.out.println();

            switch (menu) {
                case 1: 
                {
                    int menu2 = 100;
                    
                    while (menu2!=0) 
                    {                        
                        System.out.println("");
                        System.out.println("");
                        System.out.println("0. Salir\n"
                                + "1. Agregar PC\n"
                                + "2. Eliminar PC\n"
                                + "3. Listar PCs\n");
                        System.out.print("Ingrese una Opción: ");
                        menu2 = lea.nextInt();
                        System.out.println();
                        
                        switch(menu2)
                        {
                            case 1:
                            {//escritorioooooooo
                                //cuando se desea agregar, pedirá al usuario la dirección IP, la mascará de red y un hostname
                    
                                System.out.println("");
                                System.out.println("0. Salir\n"
                                        + "1. PC_Escritorio\n"
                                        + "2.  Laptop\n");
                                System.out.print("Ingrese una Opción: ");
                                int menu3 = lea.nextInt();
                                System.out.println();
                                
                                if (menu3 == 1) 
                                {
                                    System.out.print("Direccion IP: ");
                                    String ip = lea.next();

                                    String mascara = "255.255.";
                                    System.out.print("Mascara de red: " + mascara);
                                    mascara += lea.next();

                                    System.out.print("Hostname: ");
                                    String hostname = lea.next();

                                    //private int ram;
                                    //private int storage;
                                    //private String tipostorage;
                                    //private boolean tarjetaGrafica;
                                    
                                    System.out.print("RAM: ");
                                    int ram = lea.nextInt();
                                    
                                    System.out.print("Almacenamiento: ");
                                    int storage = lea.nextInt();
                                    
                                    System.out.print("Tipo de almacenamiento: ");
                                    String tipo = lea.next();
                                    
                                    System.out.println("");
                                    System.out.println("Su pc tiene tarjeta grafica?");
                                    System.out.println("");
                                    System.out.println("1) si");
                                    System.out.println("2) no");
                                    System.out.print("Ingrese una opcion: ");
                                    int TG = lea.nextInt();
                                    boolean tarjeta = true;
                                    if (TG == 1) 
                                    {
                                        tarjeta = true;
                                    }
                                    else if(TG == 2)
                                    {
                                        tarjeta = false;
                                    }
                                    else
                                    {
                                        System.out.println("Ingrese un numero valido");
                                    }
                                    
                                    //int ram, int storage, String tipostorage, boolean tarjetaGrafica, String ip, String mascara, String hostname
                                    Escritorio t =  new Escritorio(ram, storage, tipo, tarjeta, ip, mascara, hostname);
                                    
                                    System.out.println("IP binario: " + t.getIpbin());
                                    System.out.println("MASK binario: " + t.getMaskbin());
                                    
                                    PCs.add(t);
                                }
                                else if (menu3 == 2) 
                                {
                                    System.out.print("Direccion IP: ");
                                    String ip = lea.next();

                                    String mascara = "255.255.";
                                    System.out.print("Mascara de red: " + mascara);
                                    mascara += lea.next();

                                    System.out.print("Hostname: ");
                                    String hostname = lea.next();
                                    
//                                    private String marca;
//                                    private String pantalla;
//                                    private boolean RGB;
                                        
                                    System.out.print("Marca: ");
                                    String marca = lea.next();
                                    
                                    System.out.print("Pantalla: ");
                                    String pantalla = lea.next();
                                    
                                    System.out.println("");
                                    System.out.println("Su pc tiene RGB?");
                                    System.out.println("");
                                    System.out.println("1) si");
                                    System.out.println("2) no");
                                    System.out.print("Ingrese una opcion: ");
                                    int TG = lea.nextInt();
                                    boolean tarjeta = true;
                                    if (TG == 1) 
                                    {
                                        tarjeta = true;
                                    }
                                    else if(TG == 2)
                                    {
                                        tarjeta = false;
                                    }
                                    else
                                    {
                                        System.out.println("Ingrese un numero valido");
                                    }
                                    
                                    //String marca, String pantalla, boolean RGB, String ip, String mascara, String hostname
                                    Laptop t = new Laptop(marca, pantalla, tarjeta, ip, mascara, hostname);
                                    PCs.add(t);
                                }
                                else
                                {
                                    System.out.println("Ingrese un numero valido");
                                }
                                //case 1
                                break;
                            }
                            case 2:
                            {
                                imprimirarray(PCs);
                                
                                System.out.print("Ingrese la opcion que desea eliminar: ");
                                int pos = lea.nextInt();
                                
                                PCs.remove(pos);
                                break;
                            }
                            
                            case 3:
                            {
                                imprimirarray(PCs);
                                break;
                            }
                        }
                    }
                    
                    break;
                }//fin case 1

                case 2: 
                {
                    if (PCs.isEmpty()) {
                        System.out.println("No hay PCs");
                    }
                    else
                    {
                        imprimirarray(PCs);
                        System.out.print("Ingrese la PC a la que desea entrar: ");
                        int select = lea.nextInt();

                        seleccionada = PCs.get(select);
                        
                        String p = "";
                        
                        while (!p.equals("exit")) 
                        {                            
                            System.out.println("");
                            System.out.print(seleccionada.getHostname() + "#");
                            p = lea.next();
                            
                            if (p.equals("show")) 
                            {
                                System.out.println("ip = " + seleccionada.getIp());
                                System.out.println("mask = " + seleccionada.getMascara());
                            }
                            else if(p.equals("ping"))
                            {
                                
                            }
                        }
                    }
                    break;
                }//fin case 2
            } // fin switch menu
        } //fin while menu
    }
    
    public static String bin(int numero)
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
    
    public static void imprimirarray(ArrayList a)
    {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(i + ") " + a.get(i));
        }
    }
    
}
