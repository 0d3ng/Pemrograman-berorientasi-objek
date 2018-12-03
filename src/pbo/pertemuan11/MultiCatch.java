/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 3, 2018 8:35:19 AM
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
public class MultiCatch {

    public static void main(String[] args) {
        try {
            System.out.println("" + args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.getLogger(MultiCatch.class.getName()).log(Level.SEVERE, null, e);
        }catch (Exception e) {
            Logger.getLogger(MultiCatch.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Selesai");
    }

}
