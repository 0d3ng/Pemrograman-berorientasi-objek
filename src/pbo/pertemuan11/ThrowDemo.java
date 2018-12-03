/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 3, 2018 8:53:35 AM
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
public class ThrowDemo {

    public static void main(String[] args) {
        try {
            if (true) {
                throw new Exception("Catch me please");
            }
        } catch (Exception e) {
            Logger.getLogger(ThrowDemo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
