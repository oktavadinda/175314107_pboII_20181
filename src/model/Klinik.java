/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
/**
 * class klinik dengan attributte id klinik dan nama 
 * @author asus
 */
// buat class Klinik dengan attributte idKlinik dan nama yang bertipe String;
public class Klinik {
    private String idKlinik;
    private String nama;
    
    /**
     * arrayList berfungsi menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal.
     */
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    
 /**
  * berfungsi membaca getIdKlinik untuk menampilkan id klinik  pada output
  * @return 
  */
    public String getIdKlinik() {//method getIdKlinik bertipe String
        return idKlinik;
    }
/**
 * membaca setIdKlinik yang berfungsi sebagai tempat menginput id klinik
 * @param idKlinik 
 */
    public void setIdKlinik(String idKlinik) {//buat method setIdKlinik dengan parameter idKlinik bertipe String
        this.idKlinik = idKlinik;
    }
/**
 * berfungsi membaca getNama untuk menampilkan nama pada output
 * @return 
 */
    public String getNama() {// buat method getNama() bertipe String
        return nama;
    }
/**
 * membaca setNama yang berfungsi sebagai tempat menginput nama
 * @param nama 
 */
    public void setNama(String nama) {// buat method setNama dengan parameter nama bertipe String
        this.nama = nama;
    }
    
}
