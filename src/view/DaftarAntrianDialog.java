/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianDialog extends JDialog {
/**
 * class DaftarAntrianDialog yang memiliki attribute judulLabel,namaLabel,alamatLabelnoRekamMedisLabel
 * noRekamMedisText,alamatText, judulText, namaText, dan saveButton
 */
    private JLabel judulLabel; //attributte judulLabel bertipe JLabel dengan import JLabel
    private JLabel namaLabel;  //attributte namaLabel bertipe JLabel dengan import JLabel
    private JLabel alamatLabel; //attributte alamatLabel bertipe JLabel dengan import JLabel
    private JLabel noRekamMedisLabel; //attributte noRekamMedisLabel bertipe JLabel dengan import JLabel
    private JTextField noRekamMedisText; //attributte noRekamMedisText bertipe JTextField dengan import JTextField
    private JTextField alamatText; //attributte alamatText bertipe JTextField dengan import JTextField
    private JTextField judulText;  //attributte judulText bertipe JTextField dengan import JTextField
    private JTextField namaText;  //attributte namaText bertipe JTextField dengan import JTextField
    private JButton saveButton;  //attributte saveButton bertipe JButton dengan import JButton

    /**
     * fungsi membaca DaftarAntrianDialog
     * fungsi init digunakan untuk inisialisasi atau membuat stack baru yang masih kosong.
     */
    public DaftarAntrianDialog(){
        init();
    }
    /**
     * fungsi membaca init 
     */
    public void init() {
/**
 * merupakan fungsi untuk mengatur posisi label, textfield, dan button
 * dengan perintah setBounds() karena layout yang digunakan adalah null layout.
 */
        this.setLayout(null);
        judulLabel = new JLabel(" Daftar Nama Pasien "); //membuat objek dengan JLabel judul yang bernama "Daftar Nama Pasien"
        judulLabel.setBounds(98, 10, 200, 10); //ukuran untuk judul label
        this.add(judulLabel);

        namaLabel = new JLabel(" Nama "); //membuat objek dengan JLabel text "nama"
        namaLabel.setBounds(10, 40, 50, 25); //ukuran untuk nama label
        this.add(namaLabel);
        
        alamatLabel = new JLabel(" Alamat "); //membuat objek dengan JLabel text "alamat" 
        alamatLabel.setBounds(10, 90, 60, 25); //ukuran untuk alamat label
        this.add(alamatLabel);
        
        noRekamMedisLabel = new JLabel(" Nomor Rekam Medis   "); //membuat objek dengan JLabel text "nomor rekam medis"
        noRekamMedisLabel.setBounds(10, 70, 300, 25); //ukuran untuk no rekam medis label
        this.add(noRekamMedisLabel);

        noRekamMedisText = new JTextField(); //membuat objek noRekamMedisText dengan JTextField
        noRekamMedisText.setBounds(150, 70, 200, 25); //ukuran untuk no rekam medis text
        this.add(noRekamMedisText);

        alamatText = new JTextField(); //membuat objek alamatText dengan JTextField 
        alamatText.setBounds(150, 100, 200, 25); //ukuran untuk alamat text
        this.add(alamatText);

        namaText = new JTextField(); //membuat objek namaText dengan JTextField
        namaText.setBounds(150, 40, 200, 25); //ukuran untuk nama text
        this.add(namaText);

        saveButton = new JButton(" SAVE "); //membuat objek saveButton dengan JButton
        saveButton.setBounds(150, 150, 90, 30); //ukuran untuk save button
        this.add(saveButton);
        
    }

}
