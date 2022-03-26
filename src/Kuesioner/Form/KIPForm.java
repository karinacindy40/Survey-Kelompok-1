/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Form;

import Kuesioner.Entity.KIP;
import Kuesioner.Entity.Perusahaan;

/**
 *
 * @author demi
 */
public class KIPForm extends Form {

    private KIP kip;

    public void setKIP(KIP kip) {
        this.kip = kip;
    }

    public KIP getKIP() {
        return kip;
    }

    @Override
    public boolean save() {
        if (this.validate()) {
            System.out.println("KIP berhasil disimpan");
            return true;
        } else {
            System.out.println("Terdapat Kesalahan");
            return false;
        }
    }

    @Override
    public boolean validate() {
        if (kip.getKodeProv() < 1 || kip.getKodeProv() > 34) {
            String msg = "Kode Provinsi harus dari 1-34";
            super.addErrorMessages(msg);
        }

        if (kip.getKodeKab() < 1 || kip.getKodeKab() > 514) {
            String msg = "Kode Kabupaten harus dari 1-514";
            super.addErrorMessages(msg);
        }

        if (kip.getKodeKec() < 1) {
            String msg = "Kode Kecamatan tidak valid";
            super.addErrorMessages(msg);
        }

        if (kip.getKodeKJU() < 1) {
            String msg = "Kode KJU tidak valid";
            super.addErrorMessages(msg);
        }

        if (kip.getNoUrut() < 1) {
            String msg = "No Urut tidak valid";
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
