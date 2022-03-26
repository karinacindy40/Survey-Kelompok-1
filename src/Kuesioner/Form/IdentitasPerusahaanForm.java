/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Form;

import Kuesioner.Entity.IdentitasPerusahaan;

/**
 *
 * @author demi
 */
public class IdentitasPerusahaanForm extends Form {

    private IdentitasPerusahaan identitasPerusahaan;

    public void setIdentitasPerusahaan(IdentitasPerusahaan identitasPerusahaan) {
        this.identitasPerusahaan = identitasPerusahaan;
    }

    public IdentitasPerusahaan getIdentitasPerusahaan() {
        return identitasPerusahaan;
    }

    @Override
    public boolean save() {
        try {
            if (this.validate()) {
                System.out.println("Saving IdentitasPerusahaan");
                return true;
            } else {
                System.out.println("IdentitasPerusahaan is not valid");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public boolean validate() {
        if (identitasPerusahaan.getName().length() < 1 || identitasPerusahaan.getName().length() > 100) {
            String msg = "Nama Perusahaan tidak boleh kosong dan maksimal 100 karakter";
            super.addErrorMessages(msg);
        }

        if (identitasPerusahaan.getAlamat().length() < 1) {
            String msg = "Alamat Perusahaan tidak boleh kosong";
            super.addErrorMessages(msg);
        }

        if (identitasPerusahaan.getPhone().length() < 1 || identitasPerusahaan.getPhone().length() > 12) {
            String msg = "Nomor Telepon tidak boleh kosong dan maksimal 12 nomor";
            super.addErrorMessages(msg);
        }

        if (identitasPerusahaan.getFaksimili().length() < 1) {
            String msg = "Faksimili tidak boleh kosong";
            super.addErrorMessages(msg);
        }

        if (identitasPerusahaan.getBentukBadanHukum() == 0 && identitasPerusahaan.getBentukBadanHukum() > 11) {
            String msg = "Bentuk Badan Hukum tidak valid";
            super.addErrorMessages(msg);
        }

        return super.getErrorMessages().isEmpty();
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
