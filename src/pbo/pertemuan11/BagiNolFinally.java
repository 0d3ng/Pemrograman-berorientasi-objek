/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 3, 2018 8:25:02 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan11;

/**
 *
 * @author od3ng
 */
public class BagiNolFinally {

    public static void main(String[] args) {
        System.out.println("Sebelum pembagian");
        try {
            System.out.println("" + 5 / 0);
            System.out.println("Setelah pembagian");
        } finally {
            System.out.println("Selesai");
        }
    }

}
