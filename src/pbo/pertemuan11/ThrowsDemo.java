/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 3, 2018 8:59:40 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class ThrowsDemo {
    
    private static void sampleThrows() throws ClassNotFoundException{
        throw new ClassNotFoundException("Just a demo");
    }
    
    public static void main(String[] args) {
        try {
            sampleThrows();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThrowsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
