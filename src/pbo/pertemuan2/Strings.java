/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng Create at Oct 22, 2018 12:10:15 AM
 * Email: lepengdados@gmail.com
 * Github: https://github.com/0d3ng
 * Hp: 085878554150

 */
package pbo.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Strings {

    public static void contohImmutable() {
        String nama = "Noprianto";
        System.out.println("" + nama);
        nama.concat("odeng");
        System.out.println("" + nama);
    }

    public static void contohCreateString() {
        String nama = "Noprianto";//literal
        String alamat = new String("Sleman");//using keyword new
        System.out.println("" + nama);
        System.out.println("" + alamat);
        System.out.println("" + nama.length());//panjang nama
        System.out.println("" + alamat.length());
    }

    public static void contohEquals() {
        String nama = "Noprianto";
        String nama2 = "Noprianto";
        String nama3 = "NopriantO";
        String nama4 = "noprianto";
        String namaLain = new String("Noprianto");
        System.out.println("" + nama.equals(nama2));
        System.out.println("" + nama.equals(nama3));
        System.out.println("" + nama.equals(namaLain));
        System.out.println("" + nama.equalsIgnoreCase(nama4));
    }

    public static void contohOperatorSamaDengan() {
        String nama = "Noprianto";
        String nama2 = "Noprianto";
        String namaLain = new String("Noprianto");
        System.out.println("" + nama == nama2);
        System.out.println("" + nama == namaLain);
    }

    public static void contohCompareTo() {
        String nama = "Noprianto";
        String nama2 = "Noprianto";
        String nama3 = "Shannum";
        String nama4 = "Nananina";
        System.out.println("" + nama.compareTo(nama2));
        System.out.println("" + nama.compareTo(nama2));
        System.out.println("" + nama3.compareTo(nama));
        System.out.println("" + nama4.compareTo(nama));
    }

    public static void contohConcatenate() {
        String nama = "Noureen";
        String nama2 = " Akleema";
        String nama3 = " Shannum";
        System.out.println("" + nama.concat(nama2).concat(nama3));
        System.out.println("" + nama + nama2 + nama3);
        System.out.println("" + nama + nama2 + nama3 + " " + 2017);
        System.out.print("");
    }

    public static void contohFormatString() {
        System.out.printf("Nourren lahir pada tanggal"
                + " %d, hari minggu bulan %d tahun %d", 1, 1, 2017);
    }

    public static void contohSubString() {
        String desc = String.format("Nourren lahir pada tanggal"
                + " %d, hari minggu bulan %d tahun %d", 1, 1, 2017);
        System.out.println("" + desc.substring(4));
        System.out.println("" + desc.substring(0, 8));
    }

    public static void countString() {
        String input = "";
        int count = 0, countA = 0, countI = 0, countU = 0, countE = 0, countO = 0;
        System.out.println("--------------------------------------");
        System.out.println("COUNTING WORDS");
        System.out.println("");
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan kata      : ");
        input = s.nextLine();
        System.out.print("Masukan kalimat   : ");
        String kalimat = s.nextLine();
        for (String string : kalimat.split(" ")) {
            if (string.equalsIgnoreCase(input)) {
                count++;
            }
        }
        String temp = kalimat;
        for (char c : temp.toUpperCase().toCharArray()) {
            switch (c) {
                case 'A':
                    countA++;
                    break;
                case 'I':
                    countI++;
                    break;
                case 'U':
                    countU++;
                    break;
                case 'E':
                    countE++;
                    break;
                case 'O':
                    countO++;
                    break;
            }
        }
        System.out.println("Kalimat yang diinputkan: " + kalimat);
        System.out.println("Kata " + input + " berjumlah " + count);
        System.out.println("");
        System.out.println("Masing-masing vokal");
        System.out.println("--------------------------------------");
        System.out.println("A               :" + countA);
        System.out.println("I               :" + countI);
        System.out.println("U               :" + countU);
        System.out.println("E               :" + countE);
        System.out.println("O               :" + countO);
    }

    public static void sampleStringBuffer() {
        String nama = "Noureen";
        nama.concat(" Akleema");
        System.out.println("" + nama);
        StringBuilder sb = new StringBuilder();
        sb.append("Noureen");
        sb.append(" Akleema");
        System.out.println("" + sb.toString());
        System.out.println("" + sb.reverse().toString());
        StringBuffer buffer = new StringBuffer();
        buffer.append("Noureen");
        buffer.append(" Akleema");
        buffer.append(" Shannum");
        System.out.println("" + buffer.toString());
        System.out.println("" + buffer.reverse().toString());
    }

}
