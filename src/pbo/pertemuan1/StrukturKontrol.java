/*
 * Pbo

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng Create at Oct 18, 2018 2:20:47 PM
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
public class StrukturKontrol {

    public static void contoh1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan belanja: ");
        int belanja = scanner.nextInt();
        float diskon = 0;
//        if (belanja >= 100000) {
//            diskon = (float) (belanja * 0.1);
//        }
        diskon = (float) (belanja >= 100000 ? belanja * 0.1 : 0);
        System.out.println("belanja: " + (belanja - diskon));
    }

    public static void contohSwitch() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan hewan: ");
        String hewan = s.nextLine();
        switch (hewan.toLowerCase()) {
            case "kucing":
            case "kambing":
            case "sapi":
                System.out.println(hewan + " Termasuk Mamalia");
                break;
            case "mujair":
            case "lele":
            case "bandeng":
                System.out.println(hewan + " Termasuk Pisces");
                break;
            default:
                System.out.println(hewan + " Tidak diketahui");
        }
    }

}
