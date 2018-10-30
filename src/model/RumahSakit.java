/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class RumahSakit {

    private String nama;
    private String alamat;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    private ArrayList<AntrianKlinik> daftarAntrianKlinik = new ArrayList<AntrianKlinik>();

    public RumahSakit() {

    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(Pasien pasien) {
        getDaftarPasien().add(pasien);
    }

    public Pasien cariPasien(String noRM) {
        for (int i = 0; i < getDaftarPasien().size(); i++) {
            if (getDaftarPasien().get(i).getNoRekamMedis().equalsIgnoreCase(noRM)) {
                return getDaftarPasien().get(i);
            }
        }
        return null;
    }

    public void tambahPasienBaru(Pasien test) {
        getDaftarPasien().add(test);
    }

    public void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < getDaftarPasien().size(); i++) {
                String data = getDaftarPasien().get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;

            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void simpanObjekRumahSakit(File file) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaObjekRumahSakit(File file) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream is = new ObjectInputStream(fis);
            RumahSakit rs = (RumahSakit) is.readObject();
            this.nama = rs.nama;
            this.alamat = rs.alamat;
            this.daftarAntrianKlinik = rs.daftarAntrianKlinik;
            this.daftarKlinik = rs.daftarKlinik;
            this.daftarPasien = rs.daftarPasien;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the daftarPasien
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    /**
     * @param daftarPasien the daftarPasien to set
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tambahKlinik(Klinik klinik) {
        getDaftarKlinik().add(klinik);
    }

    public Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < getDaftarKlinik().size(); i++) {
            if (getDaftarKlinik().get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                return getDaftarKlinik().get(i);
            }
        }
        return null;
    }

    public void buatAntrian(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // cari antrian dalam list daftarAntri
        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            // tambah dalam list antrian
            daftarAntrianKlinik.add(antrian);
        } else {
            System.out.println("antrian sudah ada");
        }
    }

    public int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrianKlinik.size(); i++) {
            if (daftarAntrianKlinik.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrianKlinik.get(i).getBulanAntrian() == bulan
                    && daftarAntrianKlinik.get(i).getTahunAntrian() == tahun
                    && daftarAntrianKlinik.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())
                    && daftarAntrianKlinik.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                return i;
            }
        }
        return -1; // index list
    }

    public void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0) {
            daftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).mendaftar(pasien);

        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).mendaftar(pasien);
        }
        // cari antrian ada apa tidak
        // jika ada
        // panggil fungsi mendaftar dari objek antrian
        // jika tidak ada
        // buat antrian baru, panggil gungsi daftar pasien dari objek antrian
        // tambahkan objek antrian baru ke list daftar antrian
    }

    /**
     * @return the daftarAntrianKlinik
     */
    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    /**
     * @param daftarAntrianKlinik the daftarAntrianKlinik to set
     */
    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {
        this.daftarAntrianKlinik = daftarAntrianKlinik;
    }

    /**
     * @return the daftarKlinik
     */
    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    /**
     * @param daftarKlinik the daftarKlinik to set
     */
    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

}
