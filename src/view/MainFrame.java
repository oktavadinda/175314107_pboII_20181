/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.MenuBar;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

/**
 *
 * @author admin
 */
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem TambahPasienBaruDialog;
    private JMenuItem DaftarAntrianDialog;
    private JLabel mainFrameLabel;
    private JLabel mainFrameLabel1;

    public MainFrame() throws HeadlessException {
        init();

    }

    public MainFrame(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        fileMenu = new JMenu("File");
        // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("Main Frame");
        // buat menu
        this.setLayout(null);
        mainFrameLabel = new JLabel("Selamat Datang");
        mainFrameLabel.setBounds(80, 80, 300, 50);
        mainFrameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        this.add(mainFrameLabel);
        
        this.setLayout(null);
        mainFrameLabel1 = new JLabel("Silahkan Daftar");
        mainFrameLabel1.setBounds(80, 110, 300, 50);
        mainFrameLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        this.add(mainFrameLabel1);
        
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        TambahPasienBaruDialog = new JMenuItem("Tambah Antrian");
        DaftarAntrianDialog = new JMenuItem("Tambah Pasien");

        fileMenu.add(TambahPasienBaruDialog);
        fileMenu.add(DaftarAntrianDialog);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        TambahPasienBaruDialog.addActionListener(this);
        DaftarAntrianDialog.addActionListener(this);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (ae.getSource() == TambahPasienBaruDialog) {
            DaftarAntrianDialog tambah = new DaftarAntrianDialog();
            tambah.setSize(600, 350);
            tambah.setVisible(true);
        }
        if (ae.getSource() == DaftarAntrianDialog) {
            TambahPasienBaruDialog daftar = new TambahPasienBaruDialog();
            daftar.setSize(400, 300);
            daftar.setVisible(true);
        }

    }

}
