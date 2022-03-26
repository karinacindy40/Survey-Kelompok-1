package Kuesioner;

import Kuesioner.Entity.Perusahaan;

public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan1 = new Perusahaan();
        perusahaan1.generateKIP(1, 1, 1, 1, 1);
        perusahaan1.generateDPP(true, 1);
        perusahaan1.generateIdentitasPerusahaan("Mancing Mania", "Bali", "0811++++++++", "Gak Tau Ini Apa", 2);
        perusahaan1.generateSubsektor(true, false, "3a", false, true, false);
        perusahaan1.generateJenisUsahaUtama("1");
        
    }
}
