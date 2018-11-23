/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 19, 2018 9:16:44 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan7.tugas;

import java.util.Scanner;
import pbo.pertemuan6.BangunDatar;
import pbo.pertemuan6.Persegi;
import pbo.pertemuan6.PersegiPanjang;
import pbo.pertemuan6.SegiTiga;

/**
 *
 * @author od3ng
 */
public class TugasPolimorfisme {

    private static final Scanner SCAN = new Scanner(System.in);

    private static void menuPersegi() {
        int pilSubmenu;
        do {
            System.out.println("");
            System.out.println("Persegi");
            System.out.println("--------------------------");
            System.out.println("1. Luas dan keliling");
            System.out.println("2. Kembali ke awal");
            System.out.print("Pilih: ");
            pilSubmenu = SCAN.nextInt();
            switch (pilSubmenu) {
                case 1:
                    System.out.print("Masukan sisi: ");
                    BangunDatar bd = new Persegi(SCAN.nextFloat());
                    System.out.println("Luas    : " + bd.hitungLuas());
                    System.out.println("Keliling: " + bd.hitungKeliling());
                    break;
            }
        } while (pilSubmenu != 2);
    }

    private static void menuPersegiPanjang() {
        int pilSubmenu;
        do {
            System.out.println("");
            System.out.println("Persegi panjang");
            System.out.println("--------------------------");
            System.out.println("1. Luas dan keliling");
            System.out.println("2. Kembali ke awal");
            System.out.print("Pilih: ");
            pilSubmenu = SCAN.nextInt();
            switch (pilSubmenu) {
                case 1:
                    System.out.print("Masukan panjang: ");
                    float panjang = SCAN.nextFloat();
                    System.out.print("Masukan lebar: ");
                    float lebar = SCAN.nextFloat();
                    BangunDatar bd = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas    : " + bd.hitungLuas());
                    System.out.println("Keliling: " + bd.hitungKeliling());
                    break;
            }
        } while (pilSubmenu != 2);
    }

    private static void menuSegiTiga() {
        int pilSubmenu;
        do {
            System.out.println("");
            System.out.println("Segitiga");
            System.out.println("--------------------------");
            System.out.println("1. Luas");
            System.out.println("2. Kembali ke awal");
            System.out.print("Pilih: ");
            pilSubmenu = SCAN.nextInt();
            switch (pilSubmenu) {
                case 1:
                    System.out.print("Masukan alas  : ");
                    float alas = SCAN.nextFloat();
                    System.out.print("Masukan tinggi: ");
                    float tinggi = SCAN.nextFloat();
                    BangunDatar bd = new SegiTiga(alas, tinggi);
                    System.out.println("Luas    :" + bd.hitungLuas());
                    break;
            }
        } while (pilSubmenu != 2);
    }

    private static void menuUtama() {
        int pil = 0;
        do {
            System.out.println("");
            System.out.println("Tugas tentang polimorfisme");
            System.out.println("Luas-keliling bangun datar");
            System.out.println("--------------------------");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Segi tiga");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pil = SCAN.nextInt();
            switch (pil) {
                case 1:
                    menuPersegi();
                    break;
                case 2:
                    menuPersegiPanjang();
                    break;
                case 3:
                    menuSegiTiga();
                    break;
            }
        } while (pil != 4);
    }

    public static void main(String[] args) {
        menuUtama();
    }

}
