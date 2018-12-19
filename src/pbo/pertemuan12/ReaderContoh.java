/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 19, 2018 2:58:03 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class ReaderContoh {

    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("contoh-file.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print("" + (char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReaderContoh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReaderContoh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
