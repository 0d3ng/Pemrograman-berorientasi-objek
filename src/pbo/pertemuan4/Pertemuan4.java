/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 29, 2018 7:17:11 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Pertemuan4 {

    public static void contoh1() {
        String dayOfWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < dayOfWeek.length; i++) {
            System.out.print("" + dayOfWeek[i] + " ");
        }
        System.out.println("");
        for (String string : dayOfWeek) {
            System.out.print("" + string + " ");
        }
    }

    public static void contoh2() {
        int[] array = new int[6];
        array[1] = 1;
        array[5] = 5;
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            System.out.print("" + j + " ");
        }
    }

    public static void contoh3() {
        int[] array = {1, 2, 3, 4, 5};
        int[] hasil = new int[array.length];
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            hasil[j] = array[i];
        }
        for (int i : hasil) {
            System.out.print(i + " ");
        }
    }

    public static void contoh4() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan panjang array: ");
        int panjang = s.nextInt();
        int[] hasil = new int[panjang];
        for (int i = 0; i < hasil.length; i++) {
            System.out.print("Element ke-" + (i + 1) + ": ");
            hasil[i] = s.nextInt();
        }
        for (int i : hasil) {
            System.out.print("" + i + " ");
        }
    }

    public static void contoh5() {
        int array[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("" + array[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");
        for (int[] is : array) {
            for (int i : is) {
                System.out.print("" + i + " ");
            }
            System.out.println("");
        }
    }

    public static void contoh6() {
        int array[][][] = {
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
            }
        };
        for (int i = 0; i < array.length; i++) {
            int[][] ises = array[i];
            for (int j = 0; j < ises.length; j++) {
                int[] e = ises[j];
                for (int k = 0; k < e.length; k++) {
                    int l = e[k];
                    System.out.print("" + l + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
        for (int[][] ises : array) {
            for (int[] e : ises) {
                for (int i : e) {
                    System.out.print("" + i + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void contoh7() {
        int source[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int dest[] = source;
        for (int i : dest) {
            System.out.print("" + i + " ");
        }
        System.out.println("");
        source[0] = 100;
        for (int i : dest) {
            System.out.print("" + i + " ");
        }
    }

    public static void contoh8() {
        int source[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int dest[] = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
        for (int i : dest) {
            System.out.print("" + i + " ");
        }
        System.out.println("");
        source[0] = 100;
        for (int i : dest) {
            System.out.print("" + i + " ");
        }
    }

    public static void contoh9() {
        int source[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int dest[] = new int[source.length];
        System.arraycopy(source, 0, dest, 0, source.length);
        System.out.println("" + Arrays.toString(dest));
        source[0] = 100;
        System.out.println("" + Arrays.toString(dest));
    }

}
