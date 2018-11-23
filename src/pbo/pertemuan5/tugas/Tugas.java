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
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import pbo.pertemuan5.tugas.sort.MahasiswaByIpk;
import pbo.pertemuan5.tugas.sort.MahasiswaByNama;
import pbo.pertemuan5.tugas.sort.MahasiswaByNim;

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
        int pil = 0;
        do {
            System.out.println("");
            System.out.println("Tugas tentang class-object");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    int pilSubmenu;
                    do {
                        System.out.println("");
                        System.out.println("Sorting data mahasiswa");
                        System.out.println("--------------------------");
                        System.out.println("1. Sorting by nim");
                        System.out.println("2. Sorting by nama");
                        System.out.println("3. Sorting by ipk");
                        System.out.println("4. Kembali ke awal");
                        System.out.print("Pilih: ");
                        pilSubmenu = s.nextInt();
                        switch (pilSubmenu) {
                            case 1:
                                sortingByNim();
                                break;
                            case 2:
                                sortingByNama();
                                break;
                            case 3:
                                sortingByIpk();
                                break;
                        }
                    } while (pilSubmenu != 4);
            }
        } while (pil != 4);
    }

    public static void main(String[] args) {
        tugas1();
    }

    private static void sortingByNim() {
        Collections.sort(mahasiswas, new MahasiswaByNim());
        tampilData();
    }

    private static void sortingByNama() {
        Collections.sort(mahasiswas, new MahasiswaByNama());
        tampilData();
    }

    private static void sortingByIpk() {
        Collections.sort(mahasiswas, new MahasiswaByIpk());
        tampilData();
    }

}
