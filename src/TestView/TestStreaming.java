/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class TestStreaming {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            File file = new File("test.txt");
            String data ="hello world";
            fos = new FileOutputStream(file);
            fos.write(data.getBytes());
        } catch (FileNotFoundException ex){
            Logger.getLogger(TestStreaming.class.getName()).log(Level.SEVERE, msg);
        } catch
    }
    
}
