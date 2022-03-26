/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Entity;

/**
 *
 * @author demi
 */
public class Subsektor {
    private boolean tanamanPangan;
    private boolean hortikultura;
    private String perkebunan;
    private boolean peternakan;
    private boolean kehutanan;
    private boolean perikanan;

    public Subsektor(boolean tanamanPangan, boolean hortikultura, String perkebunan, boolean peternakan, boolean kehutanan, boolean perikanan) {
        this.tanamanPangan = tanamanPangan;
        this.hortikultura = hortikultura;
        this.perkebunan = perkebunan;
        this.peternakan = peternakan;
        this.kehutanan = kehutanan;
        this.perikanan = perikanan;
    }

    public boolean isTanamanPangan() {
        return tanamanPangan;
    }

    public void setTanamanPangan(boolean tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }

    public boolean isHortikultura() {
        return hortikultura;
    }

    public void setHortikultura(boolean hortikultura) {
        this.hortikultura = hortikultura;
    }

    public String getPerkebunan() {
        return perkebunan;
    }

    public void setPerkebunan(String perkebunan) {
        this.perkebunan = perkebunan;
    }

    public boolean isPeternakan() {
        return peternakan;
    }

    public void setPeternakan(boolean peternakan) {
        this.peternakan = peternakan;
    }

    public boolean isKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(boolean kehutanan) {
        this.kehutanan = kehutanan;
    }

    public boolean isPerikanan() {
        return perikanan;
    }

    public void setPerikanan(boolean perikanan) {
        this.perikanan = perikanan;
    }

    @Override
    public String toString() {
        return "Subsektor{" + "tanamanPangan=" + tanamanPangan + ", hortikultura=" + hortikultura + ", perkebunan=" + perkebunan + ", peternakan=" + peternakan + ", kehutanan=" + kehutanan + ", perikanan=" + perikanan + '}';
    }
    
    
}
