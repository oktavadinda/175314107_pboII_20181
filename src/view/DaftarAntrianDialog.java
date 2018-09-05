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
    private JTextField namaText;
    private JButton saveButton;
    
    public DaftarAntrianDialog(){
      init();  
    }
    public DaftarAntrianDialog(String title){
        this.setTitle(title);
        init();
    }
    public void init(){
        this.setLayout(null);
        
        judulLabel = new JLabel("Judul Label");
        judulLabel.setBounds(50, 250, 50, 10);
        this.add(judulLabel);
        
        namaLabel = new JLabel ("Nama Label");
        namaLabel.setBounds(50, 150, 50, 10);
        this.add(namaLabel);
        
        namaText = new JTextField ("Nama Text");
        namaText.setBounds(50, 150, 50, 10);
        this.add(namaText);
        
        saveButton = new JButton ("Save Button");
        saveButton.setBounds(50, 150, 50, 10);
        this.add(saveButton);
    }
    
}
