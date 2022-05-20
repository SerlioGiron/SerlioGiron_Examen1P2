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

                                    System.out.print("Mascara de red: ");
                                    String mascara = lea.next();

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
                                    
                                    System.out.print("IP binario: " + t.getIpbin());
                                    
                                    PCs.add(t);
                                }
                                else if (menu3 == 2) 
                                {
                                    System.out.print("Direccion IP: ");
                                    String ip = lea.next();

                                    System.out.print("Mascara de red: ");
                                    String mascara = lea.next();

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

                        System.out.println("");
                        System.out.print(seleccionada.getHostname() + "#");
                        String p = lea.next();
                    }
                    break;
                }//fin case 2
            } // fin switch menu
        } //fin while menu
    }
    
    public static void imprimirarray(ArrayList a)
    {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(i + ") " + a.get(i));
        }
    }
    
}
