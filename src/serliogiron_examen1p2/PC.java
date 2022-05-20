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

    public PC() {
    }

    public PC(String ip, String mascara, String hostname) {
        this.ip = ip;
        this.mascara = mascara;
        this.hostname = hostname;
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
