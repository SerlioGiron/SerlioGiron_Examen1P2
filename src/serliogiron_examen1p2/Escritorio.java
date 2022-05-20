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
public class Escritorio extends PC{
    private int ram;
    private int storage;
    private String tipostorage;
    private boolean tarjetaGrafica;

    public Escritorio() {
        super();
    }
    
    

    public Escritorio(int ram, int storage, String tipostorage, boolean tarjetaGrafica, String ip, String mascara, String hostname) {
        super(ip, mascara, hostname);
        this.ram = ram;
        this.storage = storage;
        this.tipostorage = tipostorage;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    
    
    @Override
    public String toString() {
        return "Escritorio{" + "ram=" + ram + ", storage=" + storage + ", tipostorage=" + tipostorage + ", tarjetaGrafica=" + tarjetaGrafica + '}';
    }

    
    
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getTipostorage() {
        return tipostorage;
    }

    public void setTipostorage(String tipostorage) {
        this.tipostorage = tipostorage;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
    
    
}
