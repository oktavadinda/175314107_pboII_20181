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

    //buat method get nomor pegawai bertipe string
    public String getNomorPegawai() {
        return nomorPegawai;
    }
    //buat method setNomorPegawai dengan parameter nomor pegawai bertipe string 

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
    //buat method getNama bertipe string

    public String getNama() {
        return nama;
    }
//buat method setNama dengan parameter nama bertipe string 

    public void setNama(String nama) {
        this.nama = nama;
    }
//buat method getAlamat bertipe string

    public String getAlamat() {
        return alamat;
    }
//buat method setAlamat dengan parameter alamat bertipe string 

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
//buat method getTempatLahir bertipe string

    public String getTempatLahir() {
        return tempatLahir;
    }
//buat method setTempatLahir dengan parameter tempatLahir bertipe string 

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
//buat method getTanggalLahir bertipe integer

    public int getTanggalLahir() {
        return tanggalLahir;
    }
//buat method setTanggalLahir dengan parameter tanggalLahir bertipe integer

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

}
