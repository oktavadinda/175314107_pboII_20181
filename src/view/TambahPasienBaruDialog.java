/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Klinik;
import model.Pasien;

/**
 *
 * @author admin
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener{

    /**
     * class DaftarAntrianDialog yang memiliki attribute
     * judulLabel,namaLabel,alamatLabelnoRekamMedisLabel
     * noRekamMedisText,alamatText, judulText, namaText, dan saveButton
     */
    private JLabel judulLabel; //attributte judulLabel bertipe JLabel dengan import JLabel
    private JLabel nik; //attributte noRekamMedisLabel bertipe JLabel dengan import JLabel
    private JLabel tanggalLabel;
    private JLabel nama;
    private JLabel alamat;
    private JLabel klinik;
    private JLabel jenisKelamin;
    private JTextField nikText;//attributte noRekamMedisText bertipe JTextField dengan import JTextField
    private JTextField namaText;//attributte noRekamMedisText bertipe JTextField dengan import JTextField
    private JTextField alamatText;//attributte noRekamMedisText bertipe JTextField dengan import JTextField
    private JRadioButton laki_laki;   
    private JRadioButton perempuan;   
    private JComboBox tanggal;
    private JComboBox bulan;
    private JComboBox tahun;
    private JComboBox Klinik;
    private JButton daftar;

    /**
     * fungsi membaca DaftarAntrianDialog fungsi init digunakan untuk
     * inisialisasi atau membuat stack baru yang masih kosong.
     */
    public TambahPasienBaruDialog() {
        init();
    }
    public TambahPasienBaruDialog(String title){
        this.setTitle(title);
        init();
    }
    /**
     * fungsi membaca init
     */
    public void init() {
        /**
         * merupakan fungsi untuk mengatur posisi label, textfield, dan button
         * dengan perintah setBounds() karena layout yang digunakan adalah null
         * layout.
         */
        this.setLayout(null);
        judulLabel = new JLabel(" DAFTAR PASIEN BARU "); //membuat objek dengan JLabel judul yang bernama "Daftar Nama Pasien"
        judulLabel.setBounds(200, 10, 200, 10); //ukuran untuk judul label
        this.add(judulLabel);

        this.setLayout(null);
        nik = new JLabel(" NIK "); //membuat objek dengan JLabel text "nomor rekam medis"
        nik.setBounds(10, 50, 300, 25); //ukuran untuk no rekam medis label
        this.add(nik);

        
        nikText = new JTextField(100); //membuat objek noRekamMedisText dengan JTextField
        nikText.setBounds(150, 50, 220, 25); //ukuran untuk no rekam medis text
        this.add(nikText);
        
        nama = new JLabel(" Nama   "); //membuat objek dengan JLabel text "nomor rekam medis"
        nama.setBounds(10, 80, 300, 25); //ukuran untuk no rekam medis label
        this.add(nama);

        namaText = new JTextField(100); //membuat objek noRekamMedisText dengan JTextField
        namaText.setBounds(150, 80, 220, 25); //ukuran untuk no rekam medis text
        this.add(namaText);
        
        alamat = new JLabel(" Alamat   "); //membuat objek dengan JLabel text "nomor rekam medis"
        alamat.setBounds(10, 110, 300, 25); //ukuran untuk no rekam medis label
        this.add(alamat);

        alamatText = new JTextField(100); //membuat objek noRekamMedisText dengan JTextField
        alamatText.setBounds(150, 110, 220, 25); //ukuran untuk no rekam medis text
        this.add(alamatText);

        jenisKelamin = new JLabel("Jenis Kelamin");
        jenisKelamin.setBounds(10, 140, 100, 15);
        this.add(jenisKelamin);

        laki_laki = new JRadioButton("Laki-Laki");
        laki_laki.setBounds(150, 140, 100, 20);
        this.add(laki_laki);

        perempuan = new JRadioButton("Perempuan");
        perempuan.setBounds(150, 170, 100, 20);
        this.add(perempuan);
        
        ButtonGroup Jkelamin = new ButtonGroup();
        Jkelamin.add(laki_laki);
        Jkelamin.add(perempuan);
        
        tanggalLabel = new JLabel("Tanggal Lahir");
        tanggalLabel.setBounds(10, 235, 150, 30);
        this.add(tanggalLabel);
        //Tombol Tanggal Lahir
        String[] tanggal = {"Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
            "25", "26", "27", "28", "29", "30", "31"};
        this.tanggal = new JComboBox(tanggal);
        this.tanggal.setBounds(150, 240, 100, 20);
        this.add(this.tanggal);
                   
        String[] bulan = {"Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        this.bulan = new JComboBox(bulan);
        this.bulan.setBounds(275, 240, 100, 20);
        this.add(this.bulan);
        
        String[] tahun = {"Tahun", "1945", "1946", "1947", "1948", "1949", "1950", "1951", 
            "1952", "1953", "1954", "1955", "1956", "1957", "1958","1959", "1960", "1961", 
            "1962", "1963", "1964", "1965", "1966", "1967", "1968","1969", "1970", "1971", 
            "1972", "1973", "1974", "1975", "1976", "1977", "1978","1979", "1980", "1981", 
            "1982", "1983", "1984", "1985", "1986", "1987", "1988","1989", "1990", "1991", 
            "1992", "1993", "1994", "1995", "1996", "1997", "1998","1999", "2000", "2001", 
            "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009","2010", "2011", 
            "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019","2020", "2021"};
        this.tahun = new JComboBox(tahun);
        this.tahun.setBounds(400, 240, 100, 20);
        this.add(this.tahun);
        
        klinik = new JLabel("KLINIK");
        klinik.setBounds(10, 200, 70, 30);
        this.add(klinik);
        
        String[] klinik = {"Pilih", "Penyakit Dalam", "Gigi", "Mata", "THT", "Mata"};
        Klinik = new JComboBox(klinik);
        Klinik.setBounds(150, 200, 100, 30);
        this.add(Klinik);
        
        daftar = new JButton("DAFTAR");
        daftar.setBounds(225, 280, 100, 30);
        this.add(daftar);
        daftar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == daftar) {
             try {
                Pasien pasien = new Pasien();
                Klinik klinik = new Klinik();
                pasien.setNama(namaText.getText());
                pasien.setAlamat(alamatText.getText());
                pasien.setNIK(nikText.getText());
                int tanggal = Integer.valueOf(this.tanggal.getSelectedItem().toString());
                int bulan = Integer.valueOf(this.bulan.getSelectedItem().toString());
                int tahun = Integer.valueOf(this.tahun.getSelectedItem().toString());
                pasien.setTanggalLahir(tanggal);
                pasien.setBulanLahir(bulan);
                pasien.setTahunLahir(tahun);
                String namaKlinik = String.valueOf(Klinik.getSelectedItem());
                klinik.setNama(namaKlinik);
                klinik.daftarKlinik(klinik);
                Pasien.tambahPasienBaru(pasien);
                JOptionPane.showMessageDialog(null, "Nomor Rekam Medis Anda : " + pasien.getNoRekamMedis());
                JOptionPane.showMessageDialog(null, "Data Anda Telah Terdaftar");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

}
