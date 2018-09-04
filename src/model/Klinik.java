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
// buat class Klinik dengan attributte idKlinik dan nama yang bertipe integer;
class Klinik {
    private String idKlinik;
    private String nama;
//method getIdKlinik bertipe String 
    public String getIdKlinik() {
        return idKlinik;
    }
//buat method setIdKlinik dengan parameter idKlinik bertipe String
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
// buat method getNama() bertipe String
    public String getNama() {
        return nama;
    }
// buat method setNama dengan parameter nama bertipe String
    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
