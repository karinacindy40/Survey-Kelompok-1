/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Form;

import Kuesioner.Entity.JenisUsahaUtama;

/**
 *
 * @author demi
 */
public class JenisUsahaUtamaForm extends Form {

    private JenisUsahaUtama jenisUsahaUtama;

    public void setJenisUsahaUtama(JenisUsahaUtama jenisUsahaUtama) {
        this.jenisUsahaUtama = jenisUsahaUtama;
    }

    public JenisUsahaUtama getJenisUsahaUtama() {
        return jenisUsahaUtama;
    }

    @Override
    public boolean save() {
        try {
            if (this.validate()) {
                System.out.println("Jenis Usaha Utama disimpan");
                return true;
            } else {
                System.out.println("Jenis Usaha Utama tidak disimpan");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public boolean validate() {
        if (jenisUsahaUtama.getJenis().equals("")) {
            String msg = "Jenis Usaha Utama tidak boleh kosong";
            super.addErrorMessages(msg);
        }

        return super.getErrorMessages().isEmpty();
    }

    @Override
    public void reset() {

    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //halo

}
