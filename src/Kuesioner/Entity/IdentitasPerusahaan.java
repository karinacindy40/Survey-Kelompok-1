/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Entity;

/**
 *
 * @author demi
 */
public class IdentitasPerusahaan {
    private String name;
    private String alamat;
    private String phone;
    private String faksimili;
    private int bentukBadanHukum;

    public IdentitasPerusahaan(String name, String alamat, String phone, String faksimili, int bentukBadanHukum) {
        this.name = name;
        this.alamat = alamat;
        this.phone = phone;
        this.faksimili = faksimili;
        this.bentukBadanHukum = bentukBadanHukum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaksimili() {
        return faksimili;
    }

    public void setFaksimili(String faksimili) {
        this.faksimili = faksimili;
    }

    public int getBentukBadanHukum() {
        return bentukBadanHukum;
    }

    public void setBentukBadanHukum(int bentukBadanHukum) {
        this.bentukBadanHukum = bentukBadanHukum;
    }

    @Override
    public String toString() {
        return "IdentitasPerusahaan{" + "name=" + name + ", alamat=" + alamat + ", phone=" + phone + ", faksimili=" + faksimili + ", bentukBadanHukum=" + bentukBadanHukum + '}';
    }
    
    
}
