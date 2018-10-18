/*
 * Pbo

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng Create at Oct 18, 2018 8:55:17 PM
 * Email: lepengdados@gmail.com
 * Github: https://github.com/0d3ng
 * Hp: 085878554150

 */
package pbo.pertemuan1;

import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Tugas {

    public static void tugas1() {
        int pilih = 0;
        do {
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
        } while (pilih != 3);
    }

}
