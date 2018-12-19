/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 19, 2018 2:02:05 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan12;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class BufferedOutputStreamContoh {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Contoh menggunakan BufferedOutputStream".getBytes());
            bos.flush();
            bos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedOutputStreamContoh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedOutputStreamContoh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
