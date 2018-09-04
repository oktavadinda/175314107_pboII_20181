/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author asus
 */
// buat class antrian pasien 
//buat attributte tanggaAntrian, bulanAntrian, tahunAntrian bertipe integer
public class AntrianPasien {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik; //membuat attributte klinik menggunakan tipe class klinik
    private Pasien daftarPasien[]; // attributte daftarPasien[] menggunakan kelas Pasien
// buat method getTanggalAntrian

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }
//buat method setTanggalAntrian menggunakan throws Exception

    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        if (tanggalAntrian > 0 && tanggalAntrian < 32) { //buat looping menggunakan if dengan parameter tanggal antrian dari 1-31
            this.tanggalAntrian = tanggalAntrian;
        } else {  // else berfungsi jika if tidak dijalankan maka masuk ke dalam else 
            throw new Exception("Tanggal antrian salah"); //akan memunculkan output "Tanggal antrian salah"
        }

    }
// buat getBulanAntrian bertipe integer

    public int getBulanAntrian() {
        return bulanAntrian;
    }
//buat method setBulanAntrian menggunakan throws Exception

    public void setBulanAntrian(int bulanAntrian) throws Exception {
        if (bulanAntrian > 0 && bulanAntrian < 13) { //buat looping menggunakan if dengan parameter bulan antrian dari 1-12
            this.bulanAntrian = bulanAntrian;
        } else {  // else berfungsi jika if tidak dijalankan maka masuk ke dalam else 
            throw new Exception("Bulan antrian salah"); //akan memunculkan output "Bulan antrian salah"
        }

    }
// buat getBulanAntrian bertipe integer

    public int getTahunAntrian() {
        return tahunAntrian;
    }
//buat method setTahunAntrian menggunakan throws Exception

    public void setTahunAntrian(int tahunAntrian) throws Exception {
        if (tahunAntrian > 0) { //buat looping menggunakan if dengan parameter tahun antrian lebih dari 0
            this.tahunAntrian = tahunAntrian;
        } else { //else berfungsi jika if tidak dijalankan maka masuk ke dalam else 
            throw new Exception("Tahun antrian salah"); //akan memunculkan output "Tahun antrian salah"
        }

    }
//buat getKlinik bertipe class Klinik

    public Klinik getKlinik() {
        return klinik;
    }
//buat setKlinik dengan parameter Klinik klinik

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
//buat getDaftarPasien bertipe Pasien[]

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }
//buat setDaftarPasien dengan parameter daftarPasien bertipe Pasien[]

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

}
