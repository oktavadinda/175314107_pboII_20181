/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    private String nik;

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
    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
    }

    public Pasien(String nama, int tanggalLahir, int bulanLahir, int tahunLahir, String noRM) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
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
    public void setNoRekamMedis(String noRekamMedis) throws Exception {//buat method setNoRekamMedis menggunakan throws Exception
        //buat looping menggunakan if dengan parameter no rekam medis  dari 6-20
        if (noRekamMedis.length() == 16) {
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new Exception("Nomor Rekam Medis anda Salah");
        }

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

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) throws Exception {
        if (nik.length() == 16) {
            String Nik = nik;
            this.setNoRekamMedis(nik);
            this.nik=nik;
        } else {
            throw new Exception("NIK anda salah");
        }
    }

    public void getTanggalKelahiran(){
        Date tanggalKelahiran= new Date(getTahunLahir()-1945, getBulanLahir()-1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }
    
    public static ArrayList<Pasien> daftarPasienKlinik(){
        return daftarPasienKlinik;
    }
    
    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).getNik().equals(noRM)) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;
    }

}
