/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Form;

import java.util.Arrays;

import Kuesioner.Entity.Subsektor;

/**
 *
 * @author demi
 */
public class SubsektorForm extends Form {

    private Subsektor subsektor;

    public void setSubsektor(Subsektor subsektor) {
        this.subsektor = subsektor;
    }

    public Subsektor getSubsektor() {
        return subsektor;
    }

    @Override
    public boolean save() {
        try {
            if (this.validate()) {
                System.out.println("Subsektor disimpan");
                return true;
            } else {
                System.out.println("Subsektor tidak disimpan");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public boolean validate() {
        int tanamanPangan = subsektor.isTanamanPangan() ? 1 : 0;
        if (tanamanPangan != 1 || tanamanPangan != 0) {
            String msg = "Tanaman Pangan tidak valid";
            super.addErrorMessages(msg);
        }

        int hortikultura = subsektor.isHortikultura() ? 1 : 0;
        if (hortikultura != 1 || hortikultura != 0) {
            String msg = "Hortikultura tidak valid";
            super.addErrorMessages(msg);
        }

        String[] perkebunanRange = { "3a", "3b", "3c", "3d", "3e", "3f", "3g", "3h", "3i", "3j", "3k", "0" };
        if (subsektor.getPerkebunan().equals("")) {
            String msg = "Subsektor tidak boleh kosong";
            super.addErrorMessages(msg);
        } else if (!Arrays.asList(perkebunanRange).contains(subsektor.getPerkebunan())) {
            String msg = "Subsektor tidak valid";
            super.addErrorMessages(msg);
        }

        int peternakan = subsektor.isPeternakan() ? 1 : 0;
        if (peternakan != 1 || peternakan != 0) {
            String msg = "Peternakan tidak valid";
            super.addErrorMessages(msg);
        }

        int perikanan = subsektor.isPerikanan() ? 1 : 0;
        if (perikanan != 1 || perikanan != 0) {
            String msg = "Perikanan tidak valid";
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
