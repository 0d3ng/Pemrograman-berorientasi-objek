/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 3, 2018 8:05:24 AM
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
public class BagiNol {

    public static void main(String[] args) {
        System.out.println("Sebelum pembagian");
        try {
            System.out.println("" + 5 / 0);
        } catch (Exception e) {
//            Logger.getLogger(BagiNol.class.getName()).log(Level.SEVERE, null, e);
            System.err.println(""+e.getMessage());
            System.err.println(""+e.getLocalizedMessage());
            e.printStackTrace();
        }
        System.out.println("Setelah pembagian");
    }

}
