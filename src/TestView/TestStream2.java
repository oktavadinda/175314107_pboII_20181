/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;

import java.io.File;
import model.Pasien;

/**
 *
 * @author admin
 */
public class TestStream2 {
    public static void main(String[] args) throws Exception {
        Pasien.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < Pasien.bacaDaftarPasien(file).size; i++) {
            System.out.println(Pasien.getDaftarPasienKlinik().get(i).toString());
           
        }
    }
}
