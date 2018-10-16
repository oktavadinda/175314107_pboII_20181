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
 */
public class AntrianPasien {


    private int tanggalAntrian; //
    private int bulanAntrian; // attributte bulan antrian bertipe integer
    private int tahunAntrian; // attributte tahun antrian bertipe integer
    private Klinik klinik; // attributte klinik menggunakan tipe class klinik

    private static ArrayList<Pasien> daftarPasienAntri
            = new ArrayList<Pasien>();
    private static ArrayList<AntrianPasien> daftarAntrian
            = new ArrayList<AntrianPasien>();

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
     *
     * @param tanggalAntrian
     * @throws Exception
     */
    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        this.tanggalAntrian = tanggalAntrian;

    }

    /**
     * fungsi method ini untuk membaca bulan antrian
     *
     * @return
     */
    public int getBulanAntrian() {// buat getBulanAntrian bertipe integer
        return bulanAntrian;
    }

    /**
     * membaca setBulanAntrian yang berfungsi sebagai tempat menginput bulan
     * antrian dengan ketentuan bulan antrian mulai dari 1-12
     *
     * @param bulanAntrian
     * @throws Exception
     */

    public void setBulanAntrian(int bulanAntrian) throws Exception {//buat method setBulanAntrian menggunakan throws Exception
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * berfungsi membaca getTahunAntrian untuk menampilkan tahun antrian pada
     * output
     *
     * @return
     */

    public int getTahunAntrian() {// buat getBulanAntrian bertipe integer
        return tahunAntrian;
    }

    /**
     * membaca setTahunAntrian yang berfungsi sebagai tempat menginput
     * TahunAntrian dengan ketntuan tahun antrian lebih dari 0
     *
     * @param tahunAntrian
     * @throws Exception
     */

    public void setTahunAntrian(int tahunAntrian) throws Exception {//buat method setTahunAntrian menggunakan throws Exception
        this.tahunAntrian = tahunAntrian;

    }

    public AntrianPasien() {

    }

    /**
     * berfungsi membaca getKlinik untuk menampilkan klinik pada output
     *
     * @return
     */

    public Klinik getKlinik() {//buat getKlinik bertipe class Klinik
        return klinik;
    }

    /**
     * membaca setKlinik yang berfungsi sebagai tempat menginput klinik
     *
     * @param klinik
     */

    public void setKlinik(Klinik klinik) {//buat setKlinik dengan parameter Klinik klinik
        this.klinik = klinik;
    }

    /**
     * berfungsi membaca getDaftarPasien untuk menampilkan daftar pasien pada
     * output
     *
     * @return
     */

    public ArrayList<Pasien> getDaftarPasien() {//buat getDaftarPasien bertipe Pasien[]
        return daftarPasienAntri;
    }

    public void setDaftarPasien(ArrayList<Pasien> pasien) {
        this.daftarPasienAntri = pasien;
    }

    /**
     * membaca setDaftarPasien yang berfungsi sebagai tempat menginput daftar
     * pasien
     *
     * @param daftarPasien
     */

//    public void setDaftarPasien(Pasien[] daftarPasien) {//buat setDaftarPasien dengan parameter daftarPasien bertipe Pasien[]
//        this.daftarPasienAntri = daftarPasien;
//    }
    public void mendaftar(Pasien pasien) {
        daftarPasienAntri.add(pasien);
    }
    
    private static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        if (cariAntrian(tanggal, bulan, tahun, klinik)==-1) {
            AntrianPasien.daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).mendaftar(pasien);
        }else {
            buatAntrian(tanggal, bulan, tahun, klinik);
        }
    }
    public static AntrianPasien cariPasien(String NoRM) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).daftarPasienAntri.equals(NoRM)) {
                return daftarAntrian.get(i);
            }
        }
        return null;
    }

    public static int cariAntrianP(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggal) {
                if (daftarAntrian.get(i).getBulanAntrian() == bulan) {
                    if (daftarAntrian.get(i).getTahunAntrian() == tahun) {
                        if (daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                            return i;
                        }

                    }
                }
            }
        }
        return -1;
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {

    }
}
