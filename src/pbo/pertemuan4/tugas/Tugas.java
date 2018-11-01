/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 29, 2018 8:37:23 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan4.tugas;

import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Tugas {

    public static void matrikIdentitas() {
        byte tinggi;
        System.out.print("Masukan tinggi matriks: ");
        Scanner s = new Scanner(System.in);
        tinggi = s.nextByte();
        int matriks[][] = new int[tinggi][tinggi];
        int x = 0, y;
        y = matriks.length - 1;
        for (int i = 0; i < matriks.length; i++) {
            int[] matrik = matriks[i];
            for (int j = 0; j < matrik.length; j++) {
                System.out.print("matriks[" + i + "," + j + "]: ");
                s = new Scanner(System.in);
                int input = s.nextInt();
                if (i == x && j == y) {
                    matriks[i][j] = 0;
                } else {
                    matriks[i][j] = input;
                }
            }
            x++;
            y--;
        }
        for (int[] matrik : matriks) {
            for (int j = 0; j < matrik.length; j++) {
                int k = matrik[j];
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }

}
