/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
// buat class  pasien 
//buat attributte no rekam medis, nama, alamat,tempat lahir bertipe String dan tanggal lahir, bulan lahir, tahun lahir bertipe integer
public class Pasien extends AntrianPasien {
//buat attributte no rekam medis, nama, alamat,tempat lahir bertipe String dan tanggal lahir, bulan lahir, tahun lahir bertipe integer

    private int noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
//method pasien kosong

    public Pasien() {

    }
// method pasien dengan parameter nama

    public Pasien(String nama) {
        this.nama = nama;
    }
// buat getNoRekanMedis bertipe String

    public int getNoRekamMedis() {
        return noRekamMedis;
    }
//buat method setNoRekamMedis menggunakan throws Exception

    public void setNoRekamMedis(int noRekamMedis) throws Exception {
        //buat looping menggunakan if dengan parameter no rekam medis  dari 6-20
        if (noRekamMedis >= 6 && noRekamMedis <= 20) {
            this.noRekamMedis = noRekamMedis;
        } else { // else berfungsi jika if tidak dijalankan maka masuk ke dalam else
            throw new Exception("No Rekam Medis salah"); //akan memunculkan output "no rekam medis salah"
        }

    }
// buat method getNama() bertipe String

    public String getNama() {
        return nama;
    }
//buat method setnama dengan parameter nama bertipe String

    public void setNama(String nama) {
        this.nama = nama;
    }
// buat method getAlamat() bertipe String

    public String getAlamat() {
        return alamat;
    }
//buat method setAlamat dengan parameter alamat bertipe String

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
// buat method getTempatTanggalLahir() bertipe String

    public String getTempatLahir() {
        return tempatLahir;
    }
//buat method setTempatLahir dengan parameter tempatLahir bertipe String

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
// buat method getTanggalLahir() bertipe integer

    public int getTanggalLahir() {
        return tanggalLahir;
    }
//buat method setTanggalLahir menggunakan throws Exception

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 32) { //buat looping menggunakan if dengan parameter tanggal lahir dari 1-31
            this.tanggalLahir = tanggalLahir;
        } else { // else berfungsi jika if tidak dijalankan maka masuk ke dalam else
            throw new Exception("Tanggal lahir salah"); //akan memunculkan output "Tanggal lahir salah"
        }

    }
// buat method getBulanLahir() bertipe integer

    public int getBulanLahir() {
        return bulanLahir;
    }
//buat method setBulanlLahir menggunakan throws Exception

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir < 13) { //buat looping menggunakan if dengan parameter bulan lahir dari 1-12
            this.bulanLahir = bulanLahir;
        } else { // else berfungsi jika if tidak dijalankan maka masuk ke dalam else
            throw new Exception("Bulan lahir salah"); //akan memunculkan output "bulan lahir salah"
        }

    }
// buat method getTahunLahir() bertipe integer

    public int getTahunLahir() {
        return tahunLahir;
    }
//buat method setTahunLahir menggunakan throws Exception

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) { //buat looping menggunakan if dengan parameter tahun lahir lebih dari 0
            this.tahunLahir = tahunLahir;
        } else { // else berfungsi jika if tidak dijalankan maka masuk ke dalam else
            throw new Exception("Tahun lahir salah"); //akan memunculkan output "Tahun lahir salah"
        }

    }

}
