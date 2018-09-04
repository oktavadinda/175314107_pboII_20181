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
public class TestPasien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Pasien P = new Pasien();
        Dokter D = new Dokter();
        Klinik K = new Klinik();
        AntrianPasien Antrian = new AntrianPasien();
        Antrian.setDaftarPasien(P.getDaftarPasien());

        P.setNoRekamMedis(10);
        P.setAlamat("Jl. mawar no 10");
        P.setNama("vadin");
        P.setTempatLahir("Palembang");
        P.setTanggalLahir(2);
        P.setBulanLahir(10);
        P.setTahunLahir(1999);

        K.setIdKlinik("101.02.10.1999");
        K.setNama("Semoga Sehat");
        P.setTanggalAntrian(1);
        P.setBulanAntrian(9);
        P.setTahunAntrian(2020);
        P.setKlinik(K);

        D.setNama("Okta");
        D.setAlamat("Tanah Merah RT.10 RW.03");
        D.setNomorPegawai("021019");
        D.setTempatLahir("Palembang");
        D.setTanggalLahir(28);

        System.out.println("\t\t Klinik     : " + K.getNama());
        System.out.println("\t\t Id Klinik  : " + K.getIdKlinik());
        System.out.println();
        System.out.println("Data Pasien");
        System.out.println("Nomor Rekam Medis   : " + P.getNoRekamMedis());
        System.out.println("Nama                : " + P.getNama());
        System.out.println("Alamat              : " + P.getAlamat());
        System.out.println("Tempat Tanggal Lahir: " + P.getTempatLahir() + ", " + P.getTanggalLahir() + "/" + P.getBulanLahir() + "/" + P.getTahunLahir());
        System.out.println("Tanggal Antrian     : " + P.getTanggalAntrian() + "/" + P.getBulanAntrian() + "/" + P.getTahunAntrian());
        System.out.println();
        System.out.println("Dokter");
        System.out.println("Nama                 : " + D.getNama());
        System.out.println("No Pegawai           : " + D.getNomorPegawai());
        System.out.println("Tempat Tanggal Lahir : " + D.getTempatLahir() + ", " + D.getTanggalLahir());
        System.out.println();

    }

}
