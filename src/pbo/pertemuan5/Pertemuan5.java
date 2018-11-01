/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 31, 2018 10:35:51 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan5;

import java.util.Date;

/**
 *
 * @author od3ng
 */
public class Pertemuan5 {

    public static void nomor1() {
        Date sekarang = new Date();
        System.out.println("" + sekarang);
    }

    public static void nomor2() {
        String[] nama = {"Nana", "Noni", "Nono"};
        System.out.println("" + nama.length);
    }
    
    public static void nomor3() {
        String kalimat = "I am a programmer!";
        System.out.println(""+kalimat.toLowerCase());
        System.out.println(""+kalimat.toUpperCase());
    }

}
