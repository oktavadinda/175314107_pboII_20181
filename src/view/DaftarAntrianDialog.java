/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.AntrianPasien;
import model.Klinik;
import model.Pasien;

/**
 *
 * @author admin
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener {
    
    private JLabel judulLabel;
    private JLabel noRekamMedis;
    private JLabel namaLabel;
    private JLabel ttlAntri;
    private JLabel blnAntri;
    private JLabel thnAntri;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JComboBox ttlAntriBox;
    private JComboBox blnAntriBox;
    private JComboBox thnAntriBox;
    private JTextField alamatText;
    private JTextField noRekamMedisText;
    private JTextField tanggalText;
    private JTextField bulanText;
    private JTextField tahunText;
    private JTextField klinikText;
    private JRadioButton tambahButton;
    private JButton simpanButton;
    
    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }    

    public void init() {
        
        this.setLayout(null);
        judulLabel = new JLabel(" Daftar Antrian Pasien "); //membuat objek dengan JLabel judul yang bernama "Daftar Nama Pasien"
        judulLabel.setBounds(185, 10, 200, 50); //ukuran untuk judul label
        judulLabel.setFont(new Font(null, Font.PLAIN, 20));
        this.add(judulLabel);
        
        this.setLayout(null);
        noRekamMedis = new JLabel("No RM");
        noRekamMedis.setBounds(10, 55, 70, 60);
        noRekamMedis.setFont(new Font(null, Font.PLAIN, 14));
        this.add(noRekamMedis);
        
        this.setLayout(null);
        
        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(100, 70, 130, 30);
        noRekamMedisText.setFont(new Font(null, Font.PLAIN, 14));
        this.add(noRekamMedisText);
        
        noRekamMedisText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pasien test = Pasien.cariPasien(noRekamMedisText.getText());
                if (test == null) {
                    JOptionPane.showMessageDialog(null, "Data Pasien " + noRekamMedisText.getText() + " Pasien Tidak Terdaftar");
                } else {
                    try {
                        Klinik klinik = new Klinik();
                        namaText.setText(test.getNama());
                        alamatText.setText(test.getAlamat());
                        String tanggal = String.valueOf(test.getTanggalLahir());
                        String bulan = String.valueOf(test.getBulanLahir());
                        String tahun = String.valueOf(test.getTahunLahir());
                        //String namaKlinik = String.valueOf(klinik.getNama());
                        tanggalText.setText(tanggal);
                        bulanText.setText(bulan);
                        tahunText.setText(tahun);
                        klinikText.setText(klinik.getNama());
                         
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                }
            }
        });
        
        this.setLayout(null);
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(280, 55, 70, 60);
        namaLabel.setFont(new Font(null, Font.PLAIN, 14));
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds(350, 70, 190, 30);
        namaText.setFont(new Font(null, Font.PLAIN, 14));
        this.add(namaText);
        
        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(280, 95, 70, 60);
        alamatLabel.setFont(new Font(null, Font.PLAIN, 14));
        this.add(alamatLabel);
        
        alamatText = new JTextField();
        alamatText.setBounds(350, 110, 190, 30);
        alamatText.setFont(new Font(null, Font.PLAIN, 14));
        this.add(alamatText);
        
        ttlAntri = new JLabel("Tgl Antri");
        ttlAntri.setBounds(10, 95, 200, 60);
        ttlAntri.setFont(new Font(null, Font.PLAIN, 14));
        this.add(ttlAntri);
        JComboBox tglAntri = new JComboBox();
        for (int i = 1; i < 32; i++) {
            tglAntri.addItem(i);
        }
        tglAntri.setBounds(100, 110, 50, 30);
        this.add(tglAntri);
        
        blnAntri = new JLabel("Bulan");
        blnAntri.setBounds(10, 135, 50, 60);
        blnAntri.setFont(new Font(null, Font.PLAIN, 14));
        this.add(blnAntri);
        JComboBox blnAntri = new JComboBox();
        blnAntri.addItem("JAN");
        blnAntri.addItem("FEB");
        blnAntri.addItem("MAR");
        blnAntri.addItem("APR");
        blnAntri.addItem("MAY");
        blnAntri.addItem("JUN");
        blnAntri.addItem("JUL");
        blnAntri.addItem("AUG");
        blnAntri.addItem("SEP");
        blnAntri.addItem("OCT");
        blnAntri.addItem("NOV");
        blnAntri.addItem("DEC");
        blnAntri.setBounds(100, 150, 50, 30);
        this.add(blnAntri);
        
        thnAntri = new JLabel("Tahun");
        thnAntri.setBounds(10, 175, 50, 60);
        thnAntri.setFont(new Font(null, Font.PLAIN, 14));
        this.add(thnAntri);        
        JComboBox thnAntri = new JComboBox();
        for (int i = 1950; i <= 2018; i++) {
            thnAntri.addItem(i);
        }
        thnAntri.setBounds(100, 190, 70, 30);
        this.add(thnAntri);

        // ttlText.setBorder(BorderFactory.createLineBorder(Color.pink));
        this.setLayout(null);
        simpanButton = new JButton("SAVE");
        simpanButton.setBounds(250, 250, 100, 30);
        simpanButton.setFont(new Font(null, Font.BOLD, 15));
        this.add(simpanButton);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tambahButton) {
            Pasien test = Pasien.cariPasien(noRekamMedisText.getText());
            for (int i = 0; i < Pasien.daftarPasienKlinik.size(); i++) {
                if (test == Pasien.daftarPasienKlinik.get(i)) {
                    try {
                        Pasien pasien = new Pasien();
                        Klinik klinik = new Klinik();
                        AntrianPasien antrian = new AntrianPasien();
                        pasien.setNama(namaText.getText());
                        pasien.setAlamat(alamatText.getText());
                        pasien.setNoRekamMedis(noRekamMedisText.getText());
                        int tanggal = Integer.parseInt(tanggalText.getText());
                        int bulan = Integer.parseInt(bulanText.getText());
                        int tahun = Integer.parseInt(tahunText.getText());
                        pasien.setTanggalLahir(tanggal);
                        pasien.setBulanLahir(bulan);
                        pasien.setTahunLahir(tahun);
                        klinik.setNama(klinikText.getText());
                        antrian.mendaftar(pasien);
                        JOptionPane.showMessageDialog(null, "No Antrian Anda : "+(i+1));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        }
        
    }
    
}
