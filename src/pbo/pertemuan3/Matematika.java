/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng Create at Oct 22, 2018 10:36:51 AM
 * Email: lepengdados@gmail.com
 * Github: https://github.com/0d3ng
 * Hp: 085878554150

 */
package pbo.pertemuan3;

/**
 *
 * @author od3ng
 */
public class Matematika {

    public static void Addition() {
        int sum1 = 10 + 20;
        int sum2 = sum1 + 33;
        int sum3 = sum2 + sum2;
        System.out.println("" + sum3);
        int result = 10;
        result = result + 20;
        System.out.println("" + result);
        result = 10;
        result += 20;
        System.out.println("" + result);
    }

    public static void Substraction() {
        int diff1 = 200 - 10;
        int diff2 = diff1 - 5;
        int diff3 = diff1 - diff2;
        System.out.println("" + diff3);
        int diff = 200 - 10 - 20;
        System.out.println("" + diff);
        diff = 200 - (-10);
        System.out.println("" + diff);
        int result = 200;
        result = result - 10;
        System.out.println("" + result);
        result = 200;
        result -= 10;
        System.out.println("" + result);
    }

}
