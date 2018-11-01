/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 31, 2018 7:44:57 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan5.tugas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Tugas {

    private static List<Mahasiswa> mahasiswas = new ArrayList<>();

    private static void inputData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nim   : ");
        String nim = s.nextLine();
        System.out.print("Masukan nama  : ");
        String nama = s.nextLine();
        System.out.print("Masukan ipk   : ");
        float ipk = s.nextFloat();
        Mahasiswa m = new Mahasiswa(nim, nama, ipk);
        mahasiswas.add(m);
    }

    private static void tampilData() {
        if (mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("-------------------------");
            int counter = 1;
            for (Mahasiswa mahasiswa : mahasiswas) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("IPK : " + mahasiswa.getIpk());
                counter++;
            }
        }
    }

    public static void tugas1() {
        int pilih = 0;
        do {
            System.out.println("");
            System.out.println("Tugas tentang class-object");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilData();
                    break;
            }
        } while (pilih != 3);
    }

    public static void main(String[] args) {
        tugas1();
    }

}
