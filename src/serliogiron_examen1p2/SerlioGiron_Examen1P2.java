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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 1;
        while (menu != 0) 
        {
            System.out.println("");
            System.out.println("0. Salir\n"
                    + "1. Agregar PC\n"
                    + "2. Ingresar PC\n");
            System.out.print("Ingrese una Opción: ");
            menu = lea.nextInt();
            System.out.println();

            switch (menu) {
                case 1: 
                {
                    //cuando se desea agregar, pedirá al usuario la dirección IP, la mascará de red y un hostname
                    
                    System.out.print("Direccion IP: ");
                    String ip = lea.next();
                    
                    System.out.print("Mascara de red: ");
                    String mascara = lea.next();
                    
                    System.out.print("Hostname: ");
                    String hostname = lea.next();
                    
                    break;
                }//fin case 1

                case 2: 
                {
                    
                    break;
                }//fin case 2
            } // fin switch menu
        } //fin while menu
    }
    
}
