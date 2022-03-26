package Kuesioner.Entity;

import java.util.List;

import Kuesioner.Form.DPPForm;
import Kuesioner.Form.IdentitasPerusahaanForm;
import Kuesioner.Form.JenisUsahaUtamaForm;
import Kuesioner.Form.KIPForm;
import Kuesioner.Form.SubsektorForm;

public class Perusahaan {
    private KIP kip;
    private IdentitasPerusahaan identitasPerusahaan;
    private DPP dpp;
    private Subsektor subsektor;
    private JenisUsahaUtama jenisUsahaUtama;

    public Perusahaan() {
    }

    public void generateKIP(int kodeProv, int kodeKab, int kodeKec, int kodeKJU, int noUrut) {
        KIPForm form = new KIPForm();
        KIP kip = new KIP(kodeProv, kodeKab, kodeKec, kodeKJU, noUrut);

        form.setKIP(kip);
        if (form.save()) {
            this.kip = kip;
        } else {
            List<String> errorMessages = form.getErrorMessages();
            System.out.println("Input invalid. Fix errors below : ");
            for (String errorMessage : errorMessages) {
                System.out.println("- " + errorMessage);
            }
        }
    }

    public void generateIdentitasPerusahaan(String name, String alamat, String phone, String faksimili,
            int bentukBadanHukum) {
        IdentitasPerusahaanForm form = new IdentitasPerusahaanForm();

        IdentitasPerusahaan identitasPerusahaan = new IdentitasPerusahaan(name, alamat, phone, faksimili,
                bentukBadanHukum);

        form.setIdentitasPerusahaan(identitasPerusahaan);
        if (form.save()) {
            this.identitasPerusahaan = identitasPerusahaan;
        } else {
            List<String> errorMessages = form.getErrorMessages();
            System.out.println("Input invalid. Fix errors below : ");
            for (String errorMessage : errorMessages) {
                System.out.println("- " + errorMessage);
            }
        }
    }

    public void generateDPP(boolean visited, int status) {
        DPPForm form = new DPPForm();
        DPP dpp = new DPP(visited, status);
        form.setDPP(dpp);

        if (form.save()) {
            this.dpp = dpp;
        } else {
            List<String> errorMessages = form.getErrorMessages();
            System.out.println("Input invalid. Fix errors below : ");
            for (String errorMessage : errorMessages) {
                System.out.println("- " + errorMessage);
            }
        }
    }

    public void generateSubsektor(boolean tanamanPangan, boolean hortikultura, String perkebunan, boolean peternakan,
            boolean kehutanan, boolean perikanan) {
        SubsektorForm form = new SubsektorForm();
        Subsektor subsektor = new Subsektor(tanamanPangan, hortikultura, perkebunan, peternakan, kehutanan, perikanan);
        form.setSubsektor(subsektor);

        if (form.save()) {
            this.subsektor = subsektor;
        } else {
            List<String> errorMessages = form.getErrorMessages();
            System.out.println("Input invalid. Fix errors below : ");
            for (String errorMessage : errorMessages) {
                System.out.println("- " + errorMessage);
            }
        }
    }

    public void generateJenisUsahaUtama(String jenis) {
        JenisUsahaUtamaForm form = new JenisUsahaUtamaForm();
        JenisUsahaUtama jenisUsahaUtama = new JenisUsahaUtama(jenis);
        form.setJenisUsahaUtama(jenisUsahaUtama);

        if (form.save()) {
            this.jenisUsahaUtama = jenisUsahaUtama;
        } else {
            List<String> errorMessages = form.getErrorMessages();
            System.out.println("Input invalid. Fix errors below : ");
            for (String errorMessage : errorMessages) {
                System.out.println("- " + errorMessage);
            }
        }
    }
    
    
}
