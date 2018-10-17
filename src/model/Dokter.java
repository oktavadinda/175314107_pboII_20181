/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    private int bulanLahir;
    private int tahunLahir;

    /**
     * berfungsi membaca getNoPegawai untuk menampilkan no pegawai pada output
     *
     * @return
     */
    public String getNomorPegawai() {//buat method get nomor pegawai bertipe string
        String noPegawai = (nomorPegawai + nama.substring(0, 3));
        return noPegawai;
    }

    /**
     * membaca setNomorPegawai yang berfungsi sebagai tempat menginput nomor
     * pegawai
     *
     * @param nomorPegawai
     */
    public void setNomorPegawai(String nomorPegawai) throws Exception {//buat method setNomorPegawai dengan parameter nomor pegawai bertipe string 
        if (nomorPegawai.length() == 6) {
            this.nomorPegawai = nomorPegawai;
        } else {
            throw new Exception("Nomor Pegawai Anda Salah");
        }
    }

    /**
     * berfungsi membaca getNama untuk menampilkan nama pada output
     *
     * @return
     */

    public String getNama() {//buat method getNama bertipe string
        return nama;
    }

    /**
     * membaca setNama yang berfungsi sebagai tempat menginput nama
     *
     * @param nama
     */

    public void setNama(String nama) {//buat method setNama dengan parameter nama bertipe string
        this.nama = nama;
    }

    /**
     * berfungsi membaca getAlamat untuk menampilkan alamat pada output
     *
     * @return
     */

    public String getAlamat() {//buat method getAlamat bertipe string
        return alamat;
    }

    /**
     * membaca setAlamat yang berfungsi sebagai tempat menginput alamat
     *
     * @param alamat
     */

    public void setAlamat(String alamat) {//buat method setAlamat dengan parameter alamat bertipe string
        this.alamat = alamat;
    }

    /**
     * berfungsi membaca getTempatLahir untuk menampilkan tempat lahir pada
     * output
     *
     * @return
     */

    public String getTempatLahir() {//buat method getTempatLahir bertipe string
        return tempatLahir;
    }

    /**
     * membaca setTempatLahir yang berfungsi sebagai tempat menginput tempat
     * lahir
     *
     * @param tempatLahir
     */

    public void setTempatLahir(String tempatLahir) {//buat method setTempatLahir dengan parameter tempatLahir bertipe string 
        this.tempatLahir = tempatLahir;
    }

    /**
     * berfungsi membaca getTanggalLahir untuk menampilkan tanggal lahir pada
     * output
     *
     * @return
     */

    public int getTanggalLahir() {//buat method getTanggalLahir bertipe integer
        return tanggalLahir;
    }

    /**
     * membaca setTanggalLahir yang berfungsi sebagai tempat menginput tanggal
     * lahir
     *
     * @param tanggalLahir
     */

    public void setTanggalLahir(int tanggalLahir) throws Exception {//buat method setTanggalLahir dengan parameter tanggalLahir bertipe integer
        if (tanggalLahir > 0 && this.tanggalLahir <= 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("Tanggal Lahir Anda Salah");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir <= 12) {
            this.bulanLahir = bulanLahir;

        } else {
            throw new Exception("Bulan Lahir Anda Salah");
        }
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun Lahir Anda Salah");
        }
    }

    public void getTanggalKelahiranDokter() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1945, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }
    public void print(){
        System.out.println();
        System.out.printf("%-20s"," ");
        System.out.println("BIODATA DOKTER"+"\n");
        System.out.printf("%-25s","Nomor Pegawai");
        System.out.println(" : "+getNomorPegawai());
        System.out.printf("%-25s","Nama");
        System.out.println(" : "+getNama());
        System.out.printf("%-25s","Alamat");
        System.out.println(" : "+getAlamat());
        System.out.printf("%-25s","Tempat Tanggal Lahir");
        System.out.print(" : "+getTempatLahir()+", ");
        getTanggalKelahiranDokter();
    }
}
