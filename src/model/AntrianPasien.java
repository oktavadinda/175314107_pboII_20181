/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 * buat class antrian pasien buat attributte tanggaAntrian, bulanAntrian,
 * tahunAntrian bertipe integer
 *
 * @author asus
 */ public class AntrianPasien {

    private int tanggalAntrian; //
    private int bulanAntrian; // attributte bulan antrian bertipe integer
    private int tahunAntrian; // attributte tahun antrian bertipe integer
    private Klinik klinik; // attributte klinik menggunakan tipe class klinik
    
    private static ArrayList<Pasien> daftarPasienAntri =
            new ArrayList<Pasien>();
    private static ArrayList<AntrianPasien> daftarAntrian = 
            new ArrayList<AntrianPasien>();

    /**
     * fungsi membaca tanggal lahir
     *
     * @return
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }
//buat method setTanggalAntrian menggunakan throws Exception
/**
 * fungsi membaca tanggal antrian dengan parameter menggunakan tipe integer
 * @param tanggalAntrian
 * @throws Exception 
 */
    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        if (tanggalAntrian > 0 && tanggalAntrian < 32) { //buat looping menggunakan if dengan parameter tanggal antrian dari 1-31
            this.tanggalAntrian = tanggalAntrian;
        } else {  // else berfungsi jika if tidak dijalankan maka masuk ke dalam else 
            throw new Exception("Tanggal antrian salah"); //akan memunculkan output "Tanggal antrian salah"
        }

    } /**
     * fungsi method ini untuk membaca bulan antrian 
     * @return 
     */
    public int getBulanAntrian() {// buat getBulanAntrian bertipe integer
        return bulanAntrian; 
    }
/**
 * membaca setBulanAntrian yang berfungsi sebagai tempat menginput bulan antrian dengan ketentuan bulan antrian mulai dari 1-12
 * @param bulanAntrian
 * @throws Exception 
 */

    public void setBulanAntrian(int bulanAntrian) throws Exception {//buat method setBulanAntrian menggunakan throws Exception
        if (bulanAntrian > 0 && bulanAntrian < 13) { //buat looping menggunakan if dengan parameter bulan antrian dari 1-12
            this.bulanAntrian = bulanAntrian;
        } else {  // else berfungsi jika if tidak dijalankan maka masuk ke dalam else 
            throw new Exception("Bulan antrian salah"); //akan memunculkan output "Bulan antrian salah"
        }

    }
/**
 * berfungsi membaca getTahunAntrian untuk menampilkan tahun antrian  pada output
 * @return 
 */

    public int getTahunAntrian() {// buat getBulanAntrian bertipe integer
        return tahunAntrian;
    }
/**
 * membaca setTahunAntrian yang berfungsi sebagai tempat menginput TahunAntrian dengan ketntuan tahun antrian lebih dari 0
 * @param tahunAntrian
 * @throws Exception 
 */

    public void setTahunAntrian(int tahunAntrian) throws Exception {//buat method setTahunAntrian menggunakan throws Exception
        if (tahunAntrian > 0) { //buat looping menggunakan if dengan parameter tahun antrian lebih dari 0
            this.tahunAntrian = tahunAntrian;
        } else { //else berfungsi jika if tidak dijalankan maka masuk ke dalam else 
            throw new Exception("Tahun antrian salah"); //akan memunculkan output "Tahun antrian salah"
        }

    }
/**
 * berfungsi membaca getKlinik untuk menampilkan klinik  pada output
 * @return 
 */

    public Klinik getKlinik() {//buat getKlinik bertipe class Klinik
        return klinik;
    }
/**
 * membaca setKlinik yang berfungsi sebagai tempat menginput klinik
 * @param klinik 
 */

    public void setKlinik(Klinik klinik) {//buat setKlinik dengan parameter Klinik klinik
        this.klinik = klinik;
    }
/**
 * berfungsi membaca getDaftarPasien untuk menampilkan daftar pasien  pada output
 * @return 
 */

    public ArrayList<Pasien> getDaftarPasien() {//buat getDaftarPasien bertipe Pasien[]
        return daftarPasienAntri;
    }
/**
 * membaca setDaftarPasien yang berfungsi sebagai tempat menginput daftar pasien
 * @param daftarPasien 
 */

//    public void setDaftarPasien(Pasien[] daftarPasien) {//buat setDaftarPasien dengan parameter daftarPasien bertipe Pasien[]
//        this.daftarPasienAntri = daftarPasien;
//    }
    
    public  void mendaftar(Pasien pasien, int tanggal, int bulan, int tahun){
        daftarPasienAntri.add(bulanAntrian, pasien);
    }
    public static AntrianPasien cariPasien(String NoRM){
       AntrianPasien.cariPasien(NoRM);
       return cariPasien(NoRM);
    }
    public static Pasien cariPasien(String noRM,int tanggal, int bulan, int tahun){
        return cariPasien(noRM, tanggal, bulan, tahun);
    }
    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        
    }
}
