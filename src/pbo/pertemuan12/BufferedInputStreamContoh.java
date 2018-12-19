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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class BufferedInputStreamContoh {

    public static void main(String[] args) {
        try {
            FileInputStream fos = new FileInputStream("sample.txt");
            BufferedInputStream bos = new BufferedInputStream(fos);
            int i;
            while ((i = bos.read()) != -1) {
                System.out.print((char) i);
            }
            bos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedInputStreamContoh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedInputStreamContoh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
