/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 19, 2018 2:47:23 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class WriterContoh {
    
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("contoh-file.txt");
            writer.write("Contoh menulis karakter");
            writer.flush();
            writer.close();
            System.out.println("Selesai.");
        } catch (IOException ex) {
            Logger.getLogger(WriterContoh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
