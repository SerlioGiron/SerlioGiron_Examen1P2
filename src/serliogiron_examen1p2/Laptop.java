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
public class Laptop extends PC{
    private String marca;
    private String pantalla;
    private boolean RGB;

    public Laptop() {
        super();
    }
    
    

    public Laptop(String marca, String pantalla, boolean RGB, String ip, String mascara, String hostname) {
        super(ip, mascara, hostname);
        this.marca = marca;
        this.pantalla = pantalla;
        this.RGB = RGB;
    }
    
    

    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", pantalla=" + pantalla + ", RGB=" + RGB + '}';
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }
    
    
}
