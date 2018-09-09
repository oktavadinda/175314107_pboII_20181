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
// buat class dokter dengan attributte no pegawai, nama, alamat,tempat lahir menggunakan tipe String dan tanggal lahir bertipe integer
public class Dokter {

    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;

    /**
     * berfungsi membaca getNoPegawai untuk menampilkan no pegawai pada output
     * @return 
     */
    public String getNomorPegawai() {//buat method get nomor pegawai bertipe string
        return nomorPegawai;
    }
    /**
     * membaca setNomorPegawai yang berfungsi sebagai tempat menginput nomor pegawai
     * @param nomorPegawai 
     */
    public void setNomorPegawai(String nomorPegawai) {//buat method setNomorPegawai dengan parameter nomor pegawai bertipe string 

        this.nomorPegawai = nomorPegawai;
    }
    /**
     * berfungsi membaca getNama untuk menampilkan nama pada output
     * @return 
     */

    public String getNama() {//buat method getNama bertipe string
        return nama;
    }
 /**
  * membaca setNama yang berfungsi sebagai tempat menginput nama
  * @param nama 
  */

    public void setNama(String nama) {//buat method setNama dengan parameter nama bertipe string
        this.nama = nama;
    }
/**
 * berfungsi membaca getAlamat untuk menampilkan alamat pada output
 * @return 
 */

    public String getAlamat() {//buat method getAlamat bertipe string
        return alamat;
    }
 /**
  * membaca setAlamat yang berfungsi sebagai tempat menginput alamat
  * @param alamat 
  */

    public void setAlamat(String alamat) {//buat method setAlamat dengan parameter alamat bertipe string
        this.alamat = alamat;
    }
/**
 * berfungsi membaca getTempatLahir untuk menampilkan tempat lahir pada output
 * @return 
 */

    public String getTempatLahir() {//buat method getTempatLahir bertipe string
        return tempatLahir;
    }
/**
 * membaca setTempatLahir yang berfungsi sebagai tempat menginput tempat lahir
 * @param tempatLahir 
 */

    public void setTempatLahir(String tempatLahir) {//buat method setTempatLahir dengan parameter tempatLahir bertipe string 
        this.tempatLahir = tempatLahir;
    }
/**
 * berfungsi membaca getTanggalLahir untuk menampilkan tanggal lahir pada output
 * @return 
 */

    public int getTanggalLahir() {//buat method getTanggalLahir bertipe integer
        return tanggalLahir;
    }
/**
 * membaca setTanggalLahir yang berfungsi sebagai tempat menginput tanggal lahir
 * @param tanggalLahir 
 */

    public void setTanggalLahir(int tanggalLahir) {//buat method setTanggalLahir dengan parameter tanggalLahir bertipe integer
        this.tanggalLahir = tanggalLahir;
    }

}
