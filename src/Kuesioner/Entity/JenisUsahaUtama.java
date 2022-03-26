/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Entity;

/**
 *
 * @author demi
 */
public class JenisUsahaUtama {
    private String jenis;
    
    public JenisUsahaUtama(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return "JenisUsahaUtama{" + "jenis=" + jenis + '}';
    }
    
    
}
