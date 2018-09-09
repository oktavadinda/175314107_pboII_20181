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

        this.setLayout(null);
        judulLabel = new JLabel(" Daftar Nama Pasien ");
        judulLabel.setBounds(98, 10, 200, 10);
        this.add(judulLabel);

        namaLabel = new JLabel(" Nama ");
        namaLabel.setBounds(10, 40, 50, 25);
        this.add(namaLabel);
        
        alamatLabel = new JLabel(" Alamat ");;
        alamatLabel.setBounds(10, 90, 60, 25);
        this.add(alamatLabel);
        
        noRekamMedisLabel = new JLabel(" Nomor Rekam Medis   ");
        noRekamMedisLabel.setBounds(10, 70, 300, 25);
        this.add(noRekamMedisLabel);

        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(150, 70, 200, 25);
        this.add(noRekamMedisText);

        alamatText = new JTextField();
        alamatText.setBounds(80, 90, 60, 25);
        this.add(alamatText);

        namaText = new JTextField();
        namaText.setBounds(70, 40, 100, 25);
        this.add(namaText);

        saveButton = new JButton(" SAVE ");
        saveButton.setBounds(150, 150, 90, 30);
        this.add(saveButton);
    }

}
