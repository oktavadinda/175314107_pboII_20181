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
    private JLabel tanggalLahir;
    private JLabel alamatLabel;
    private JLabel klinikLabel;
    private JLabel pisah1, pisah2;
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
    private JComboBox tanggalButton;
    private JComboBox bulanButton;
    private JComboBox tahunButton;
    private JComboBox klinikButton;
    private JButton daftarButton;
    
    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }    

    public void init() {
        
        this.setLayout(null);
        
        judulLabel = new JLabel("TAMBAH ANTRIAN PASIEN");
        judulLabel.setBounds(230, 15, 150, 10);
        this.add(judulLabel);
        
        noRekamMedis = new JLabel("No Rekam Medis");
        noRekamMedis.setBounds(20, 50, 100, 15);
        this.add(noRekamMedis);
        
        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(150, 50, 350, 20);
        this.add(noRekamMedisText);
        
        noRekamMedisText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Pasien test = Pasien.cariPasien(noRekamMedisText.getText());
                if (test == null) {
                    JOptionPane.showMessageDialog(null, "Data Pasien" + noRekamMedisText.getText()+"Pasien Tidak Terdaftar");
                    
                }else {
                    try {
                        Klinik klinik = new Klinik();
                        namaText.setText(test.getNama());
                        alamatText.setText(test.getAlamat());
                        String tgl = String.valueOf(test.getTanggalLahir());
                        String bln = String.valueOf(test.getBulanLahir());
                        String thn = String.valueOf(test.getTahunLahir());
                        tanggalText.setText(tgl);
                        bulanText.setText(bln);
                        tahunText.setText(thn);
                        klinikText.setText(klinik.getNama());
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                        }
        });
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 80, 50,15);
        this.add(namaLabel);
        
        // membuat object namatext yang bertipe JTextField
        namaText = new JTextField(100);
        // mengatur posisi dan ukuran object
        namaText.setBounds(150, 80, 350, 20);
        //menambah namatext ke TambahAntrianDialog
        this.add(namaText);
        //namatext memanggil method addActionListener
        namaText.addActionListener(this);
        
        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(20, 110,100, 15);
        this.add(alamatLabel);
        
        alamatText = new JTextField(100);
        alamatText.setBounds(150, 110, 350, 20);
        this.add(alamatText);
        alamatText.addActionListener(this);
        
        tanggalLahir = new JLabel("Tanggal Lahir");
        tanggalLahir.setBounds(20, 140, 350, 15);
        this.add(tanggalLahir);
        
        tanggalText = new JTextField(100);
        tanggalText.setBounds(150, 140, 100, 20);
        this.add(tanggalText);
        
        pisah1 = new JLabel("/");
        pisah1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        pisah1.setBounds(260, 126, 50, 50);
        this.add(pisah1);
        
        pisah2 = new JLabel("/");
        pisah2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        pisah2.setBounds(383, 126, 50, 50);
        this.add(pisah2);
        
        bulanText = new JTextField(100);
        bulanText.setBounds(275, 140, 100, 20);
        this.add(bulanText);
        
        tahunText = new JTextField(100);
        tahunText.setBounds(400, 140, 100, 20);
        this.add(tahunText);
        
        klinikLabel = new JLabel("Klinik");
        klinikLabel.setBounds(20, 175, 50, 15);
        this.add(klinikLabel);
        
        klinikText = new JTextField(100);
        klinikText.setBounds(150, 170, 350, 20);
        this.add(klinikText);
        
        daftarButton = new JButton("Daftar");
        daftarButton.setBounds(240, 210, 80, 30);
        this.add(daftarButton);
        daftarButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tanggalButton) {
            Pasien test = Pasien.cariPasien(noRekamMedisText.getText());
            for (int i = 0; i < Pasien.daftarPasien.size(); i++) {
                if (test == Pasien.daftarPasien.get(i)) {
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
