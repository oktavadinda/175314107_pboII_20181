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

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel noRekamMedisLabel;
    private JTextField noRekamMedisText;
    private JTextField alamatText;
    private JTextField judulText;
    private JTextField namaText;
    private JButton saveButton;

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
        alamatText.setBounds(150, 70, 200, 25);
        this.add(alamatText);

        namaText = new JTextField();
        namaText.setBounds(150, 70, 200, 25);
        this.add(namaText);

        saveButton = new JButton(" SAVE ");
        saveButton.setBounds(150, 150, 90, 30);
        this.add(saveButton);
    }

}
