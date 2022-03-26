/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Form;

import Kuesioner.Entity.DPP;

/**
 *
 * @author demi
 */
public class DPPForm extends Form {
    private DPP dpp;

    public void setDPP(DPP dpp) {
        this.dpp = dpp;
    }

    public DPP getDPP() {
        return dpp;
    }

    @Override
    public boolean save() {
        try {
            if (this.validate()) {
                System.out.println("Saving DPP");
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public boolean validate() {
        int visited = dpp.isVisited() ? 1 : 0;
        
        if (visited != 1 && visited != 0) {
            String msg = "Visited tidak valid";
            super.addErrorMessages(msg);
        }

        if (dpp.getStatus() < 1 || dpp.getStatus() > 9) {
            String msg = "Status tidak valid";
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
