/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Entity;

/**
 *
 * @author demi
 */
public class KIP {
    private int kodeProv;
    private int kodeKab;
    private int kodeKec;
    private int kodeKJU;
    private int noUrut;

    public KIP(int kodeProv, int kodeKab, int kodeKec, int kodeKJU, int noUrut) {
        this.kodeProv = kodeProv;
        this.kodeKab = kodeKab;
        this.kodeKec = kodeKec;
        this.kodeKJU = kodeKJU;
        this.noUrut = noUrut;
    }

    public int getKodeProv() {
        return kodeProv;
    }

    public void setKodeProv(int kodeProv) {
        this.kodeProv = kodeProv;
    }

    public int getKodeKab() {
        return kodeKab;
    }

    public void setKodeKab(int kodeKab) {
        this.kodeKab = kodeKab;
    }

    public int getKodeKec() {
        return kodeKec;
    }

    public void setKodeKec(int kodeKec) {
        this.kodeKec = kodeKec;
    }

    public int getKodeKJU() {
        return kodeKJU;
    }

    public void setKodeKJU(int kodeKJU) {
        this.kodeKJU = kodeKJU;
    }

    public int getNoUrut() {
        return noUrut;
    }

    public void setNoUrut(int noUrut) {
        this.noUrut = noUrut;
    }

    @Override
    public String toString() {
        return "KIP{" + "kodeProv=" + kodeProv + ", kodeKab=" + kodeKab + ", kodeKec=" + kodeKec + ", kodeKJU=" + kodeKJU + ", noUrut=" + noUrut + '}';
    }
    
    
}
