/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import TestView.TestStream2;
import TestView.TestStreaming1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author okta
 */
// buat class  pasien 
//buat attributte no rekam medis, nama, alamat,tempat lahir bertipe String dan tanggal lahir, bulan lahir, tahun lahir bertipe integer
public class Pasien {

    /**
     * buat attributte no rekam medis, nama, alamat,tempat lahir bertipe String
     * dan tanggal lahir, bulan lahir, tahun lahir bertipe integer
     */
    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String NIK;

    public static ArrayList<Pasien> daftarPasienKlinik
            = new ArrayList<Pasien>();

    /**
     * buat method kosong, yang berfungsi membaca class pasien
     */
//method pasien kosong
    public Pasien() {

    }

    /**
     * berfungsi memanggil pasien dengan parameter nama
     *
     * @param nama
     */
    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String NIK) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.NIK = NIK;
    }

    public Pasien(String nama, int tanggalLahir, int bulanLahir, int tahunLahir, String noRM) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }

    /**
     * berfungsi memanggil getNama
     *
     * @return
     */
    public String getNama() {// buat method getNama() bertipe String
        return nama;
    }

    /**
     * membaca setNama yang berfungsi sebagai tempat menginput nama
     *
     * @param nama
     */
    public void setNama(String nama) {//buat method setnama dengan parameter nama bertipe String
        this.nama = nama;
    }

    /**
     * berfungsi membaca getAlamat untuk menampilkan alamat pada output
     *
     * @return
     */
    public String getAlamat() {// buat method getAlamat() bertipe String
        return alamat;
    }

    /**
     * membaca setAlamat yang berfungsi sebagai tempat menginput alamat
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {//buat method setAlamat dengan parameter alamat bertipe String
        this.alamat = alamat;
    }

    /**
     * berfungsi membaca getTempatLahir untuk menampilkan tempat lahir pada
     * output
     *
     * @return tempatLahir
     */
    public String getTempatLahir() {// buat method getTempatTanggalLahir() bertipe String
        return tempatLahir;
    }

    /**
     * membaca setTempatLahir yang berfungsi sebagai tempat menginput
     * tempatLahir
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {//buat method setTempatLahir dengan parameter tempatLahir bertipe String
        this.tempatLahir = tempatLahir;
    }

    /**
     * berfungsi membaca getTanggalLahir untuk menampilkan tanggal lahir pada
     * output
     *
     * @return
     */
    public int getTanggalLahir() {// buat method getTanggalLahir() bertipe integer
        return tanggalLahir;
    }

    public void setNIK(String NIK) throws Exception {
        if (NIK.length() == 16) {
            String nik = NIK;
            this.setNoRekamMedis(NIK);
            this.NIK = NIK;
        } else {
            throw new Exception("Nomor Induk Kependudukan terdiri dari 16 karakter");
        }
    }

    public String getNik() {
        return NIK;
    }

    /**
     * membaca getNoRekamMedis untuk mengembalikan nilai noRekamMedis
     *
     * @return noRekamMedis
     */
    public String getNoRekamMedis() {// buat getNoRekanMedis bertipe String
        return noRekamMedis;
    }

    /**
     * membaca method setNoRekamMedis untuk memasukkan no rekam medis
     *
     * @param noRekamMedis
     * @throws Exception
     */
//    public void setNoRekamMedis(String noRekamMedis) throws Exception {//buat method setNoRekamMedis menggunakan throws Exception
//        //buat looping menggunakan if dengan parameter no rekam medis  dari 6-20
//        if (noRekamMedis.length() == 16) {
//            this.noRekamMedis = noRekamMedis;
//        } else {
//            throw new Exception("Nomor Rekam Medis anda Salah");
//        }
//
//    }
    public void setNoRekamMedis(String noRekamMedis){
        this.noRekamMedis = noRekamMedis;
    }

    /**
     * membaca setTanggalLahir yang berfungsi sebagai tempat menginput tanggal
     * lahir yang telah diberikan ketentuan yaitu mulai dari 1-31
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {//buat method setTanggalLahir menggunakan throws Exception
        if (tanggalLahir > 0 && tanggalLahir < 32) { //buat looping menggunakan if dengan parameter tanggal lahir dari 1-31
            this.tanggalLahir = tanggalLahir;
        } else { // else berfungsi jika if tidak dijalankan maka masuk ke dalam else
            throw new Exception("Tanggal lahir salah"); //akan memunculkan output "Tanggal lahir salah"
        }

    }

    /**
     * berfungsi membaca getBulanLahir untuk menampilkan bulan lahir pada output
     *
     * @return
     */
    public int getBulanLahir() {// buat method getBulanLahir() bertipe integer
        return bulanLahir;
    }

    /**
     * membaca setBulan Lahir yang berfungsi sebagai tempat menginput lahir,
     * yang telah diberikan ketentuan yaitu mulai dari 1-12
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {//buat method setBulanlLahir menggunakan throws Exception
        if (bulanLahir > 0 && bulanLahir < 13) { //buat looping menggunakan if dengan parameter bulan lahir dari 1-12
            this.bulanLahir = bulanLahir;
        } else { // else berfungsi jika if tidak dijalankan maka masuk ke dalam else
            throw new Exception("Bulan lahir salah"); //akan memunculkan output "bulan lahir salah"
        }

    }

    /**
     * berfungsi membaca getTahunLahir untuk menampilkan tahun lahir pada output
     *
     * @return
     */
    public int getTahunLahir() {// buat method getTahunLahir() bertipe integer
        return tahunLahir;
    }

    /**
     * membaca setTahunLahir yang berfungsi sebagai tempat menginput tahun
     * lahir, yang memiliki ketentuan mulai dari 1
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {//buat method setTahunLahir menggunakan throws Exception
        if (tahunLahir > 0) { //buat looping menggunakan if dengan parameter tahun lahir lebih dari 0
            this.tahunLahir = tahunLahir;
        } else { // else berfungsi jika if tidak dijalankan maka masuk ke dalam else
            throw new Exception("Tahun lahir salah"); //akan memunculkan output "Tahun lahir salah"
        }

    }

    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1945, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }
//
//    public static ArrayList<Pasien> daftarPasienKlinik() {
//        return daftarPasienKlinik();
//    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public String BuatNomorRekamMedis() {
        String nomorRekamMEdis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        nomorRekamMEdis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMEdis;
    }

    public static ArrayList<Pasien> getDaftarPasienKlinik() {
        return daftarPasienKlinik;
    }

    public static void setDaftarPasienKlinik(ArrayList<Pasien> daftarPasien) {
        Pasien.daftarPasienKlinik = daftarPasien;
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).NIK.equals(noRM)) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;
    }

    public static void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void bacaDaftarPasien(File file) throws Exception {
        FileInputStream fos = null;
        try {
            String hasilBaca = "";
            fos = new FileInputStream(file);
            int data;
            boolean isNoRM = false;
            boolean isNama = false;
            boolean isAlamat = false;
            Pasien temp = new Pasien();

            while ((data = fos.read()) != -1) {
                if ((char) data != '\n') {
                    if ((char) data != '\t') {
                        hasilBaca = hasilBaca + (char) data;
                    } else {
                        if (isNoRM == false) {
                            temp.setNoRekamMedis(hasilBaca);
                            isNoRM = true;
                            hasilBaca = "";
                        } else if (isNama == false) {
                            temp.setNama(hasilBaca);
                            isNama = true;
                            hasilBaca = "";
                        }
                    }
                } else {
                    temp.setAlamat(hasilBaca);
                    hasilBaca = "";
                    isAlamat = true;
                    Pasien.tambahPasienBaru(temp);
                    isNoRM = false;
                    isNama = false;
                    isAlamat = false;
                    temp = new Pasien();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestStream2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestStreaming1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestStreaming1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String toString() {
        return noRekamMedis + "\t" + nama + "\t" + alamat + "\n";
    }

    public void print() {
        System.out.printf("%-25s", "No Rekam Medis Pasien");
        System.out.println(" : " + getNoRekamMedis());
        System.out.printf("%-25s", "Nama Pasien");
        System.out.println(" : " + getNama());
        System.out.printf("%-25s", "Tempat Tanggal Lahir");
        System.out.println(" : " + getTempatLahir() + ", ");
        getTanggalKelahiran();
        System.out.printf("%-25s", "Alamat");
        System.out.println(" : " + getAlamat());
        System.out.println();
    }
}
