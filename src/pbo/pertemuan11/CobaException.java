/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 3, 2018 9:06:10 AM
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
public class CobaException {

    public static void main(String[] args) {
        try {
            if (true) {
                throw new ManualException("Jangkrik bozz");
            }
        } catch (ManualException e) {
            Logger.getLogger(ThrowsDemo.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}

class ManualException extends Exception {

    public ManualException(String message) {
        super(message);
    }

}
