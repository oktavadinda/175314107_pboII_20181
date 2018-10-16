/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class TambahPasienBaruDialog extends JDialog {

    /**
     * class DaftarAntrianDialog yang memiliki attribute
     * judulLabel,namaLabel,alamatLabelnoRekamMedisLabel
     * noRekamMedisText,alamatText, judulText, namaText, dan saveButton
     */
    private JLabel judulLabel; //attributte judulLabel bertipe JLabel dengan import JLabel
    private JLabel noRekamMedisLabel; //attributte noRekamMedisLabel bertipe JLabel dengan import JLabel
    private JLabel tanggalLabel;
    private JLabel bulanLabel;
    private JLabel tahunLabel;
    private JLabel nama;
    private JLabel alamat;
    private JTextField noRekamMedisText;//attributte noRekamMedisText bertipe JTextField dengan import JTextField
    private JTextField namaText;//attributte noRekamMedisText bertipe JTextField dengan import JTextField
    private JTextField alamatText;//attributte noRekamMedisText bertipe JTextField dengan import JTextField
    private JComboBox tanggal;
    private JComboBox bulan;
    private JComboBox tahun;
    private JButton save;

    /**
     * fungsi membaca DaftarAntrianDialog fungsi init digunakan untuk
     * inisialisasi atau membuat stack baru yang masih kosong.
     */
    public TambahPasienBaruDialog() {
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
        judulLabel = new JLabel(" Daftar Pasien "); //membuat objek dengan JLabel judul yang bernama "Daftar Nama Pasien"
        judulLabel.setBounds(98, 10, 200, 10); //ukuran untuk judul label
        this.add(judulLabel);

        this.setLayout(null);
        noRekamMedisLabel = new JLabel(" Nomor Rekam Medis   "); //membuat objek dengan JLabel text "nomor rekam medis"
        noRekamMedisLabel.setBounds(10, 50, 300, 25); //ukuran untuk no rekam medis label
        this.add(noRekamMedisLabel);

        noRekamMedisText = new JTextField(); //membuat objek noRekamMedisText dengan JTextField
        noRekamMedisText.setBounds(150, 50, 220, 25); //ukuran untuk no rekam medis text
        this.add(noRekamMedisText);
        
        this.setLayout(null);
        nama = new JLabel(" Nama   "); //membuat objek dengan JLabel text "nomor rekam medis"
        nama.setBounds(10, 80, 300, 25); //ukuran untuk no rekam medis label
        this.add(nama);

        namaText = new JTextField(); //membuat objek noRekamMedisText dengan JTextField
        namaText.setBounds(150, 80, 220, 25); //ukuran untuk no rekam medis text
        this.add(namaText);
        
        this.setLayout(null);
        alamat = new JLabel(" Alamat   "); //membuat objek dengan JLabel text "nomor rekam medis"
        alamat.setBounds(10, 110, 300, 25); //ukuran untuk no rekam medis label
        this.add(alamat);

        alamatText = new JTextField(); //membuat objek noRekamMedisText dengan JTextField
        alamatText.setBounds(150, 110, 220, 25); //ukuran untuk no rekam medis text
        this.add(alamatText);

        this.setLayout(null);
        tanggalLabel = new JLabel("Tgl Lahir");
        tanggalLabel.setBounds(10, 140, 80, 30);
        this.add(tanggalLabel);
        JComboBox tglLahir = new JComboBox();
        for (int i = 1; i < 32; i++) {
            tglLahir.addItem(i);
        }
        tglLahir.setBounds(65, 140, 50, 30);
        this.add(tglLahir);

        this.setLayout(null);
        bulanLabel = new JLabel("Bulan");
        bulanLabel.setBounds(140, 140, 80, 30);
        this.add(bulanLabel);
        JComboBox blnLahir = new JComboBox();
        blnLahir.addItem("JAN");
        blnLahir.addItem("FEB");
        blnLahir.addItem("MAR");
        blnLahir.addItem("APR");
        blnLahir.addItem("MAY");
        blnLahir.addItem("JUN");
        blnLahir.addItem("JUL");
        blnLahir.addItem("AUG");
        blnLahir.addItem("SEP");
        blnLahir.addItem("OCT");
        blnLahir.addItem("NOV");
        blnLahir.addItem("DEC");
        blnLahir.setBounds(180, 140, 50, 30);
        this.add(blnLahir);

        this.setLayout(null);
        tahunLabel = new JLabel("Tahun");
        tahunLabel.setBounds(255, 140, 70, 30);
        this.add(tahunLabel);
        JComboBox thnLahir = new JComboBox();
        for (int i = 1950; i <= 2018; i++) {
            thnLahir.addItem(i);
        }
        thnLahir.setBounds(300, 140, 70, 30);
        this.add(thnLahir);
        
        save = new JButton("SAVE");
        save.setBounds(150, 200, 100, 30);
        this.add(save);
    }
//
//    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {
//        tanggal.actionPerformed(evt);
//    }

}