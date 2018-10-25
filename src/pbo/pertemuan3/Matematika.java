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

import java.util.Random;
import java.util.Scanner;

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

    public static void Multiplication() {
        int prod1 = 10 * 20;
        int prod2 = prod1 * 5;
        int prod3 = prod1 * prod2;
        System.out.println("" + prod3);
        int result = 10;
        result = result * 20;
        System.out.println("" + result);
        result = 10;
        result *= 20;
        System.out.println("" + result);
    }

    public static void Division() {
        int division1 = 100 / 10;
        int division2 = division1 / 2;
        int division3 = division1 / division2;
        System.out.println("" + division3);
        int result = 100;
        result = result / 5;
        System.out.println("" + result);
        result = 100;
        result /= 5;
        System.out.println("" + result);
    }

    public static void modulo() {
        int value = 100;
        int remainder = value % 9;
        System.out.println("" + remainder);
        int result = 100;
        result %= 9;
        System.out.println("" + result);
    }

    public static void precedence() {
        int result = 100 * 100 / 5 + 200 * 3 / 2;
        System.out.println("" + result);
        result = 100 * 100 / (5 + 200) * 3 / 2;
        System.out.println("" + result);
    }

    public static void NumberValue() {
        int result = 100 / 8;
        System.out.println("" + result);
    }

    public static void NumberValueFloating() {
        double no1 = 100;
        double no2 = 8;
        double result = no1 / no2;
        System.out.println("" + result);
    }

    public static void basicFunction() {
        int abs1 = Math.abs(10);
        int abs2 = Math.abs(-20);
        double ceil = Math.ceil(7.343);
        double floor = Math.floor(7.343);
        int min = Math.min(10, 20);
        int max = Math.max(10, 20);
        System.out.println("" + abs1);
        System.out.println("" + abs2);
        System.out.println("" + ceil);
        System.out.println("" + floor);
        System.out.println("" + min);
        System.out.println("" + max);
    }

    public static void exponensial() {
        double exp1 = Math.exp(1);
        System.out.println("exp1 = " + exp1);
        double exp2 = Math.exp(2);
        System.out.println("exp2 = " + exp2);
        double log1 = Math.log(1);
        System.out.println("log1 = " + log1);
        double log10 = Math.log(10);
        System.out.println("log10 = " + log10);
        double log10_1 = Math.log10(1);
        System.out.println("log10_1 = " + log10_1);
        double log10_100 = Math.log10(100);
        System.out.println("log10_100 = " + log10_100);
        double pow2 = Math.pow(2, 2);
        System.out.println("pow2 = " + pow2);
        double pow8 = Math.pow(2, 8);
        System.out.println("pow8 = " + pow8);
        double sqrt4 = Math.sqrt(4);
        System.out.println("sqrt4 = " + sqrt4);
    }

    public static void trigonometri() {
        double sin = Math.sin(Math.PI);
        System.out.println("sin = " + sin);
        double cos = Math.cos(Math.PI);
        System.out.println("cos = " + cos);
        double tan = Math.tan(Math.PI);
        System.out.println("tan = " + tan);
    }

    public static void tugas() {
        Scanner s = new Scanner(System.in);
        System.out.print("masukan min: ");
        int min = s.nextInt();
        System.out.print("masukan max: ");
        int max = s.nextInt();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int value = r.nextInt((max - min) + 1) + min;
            System.out.println("" + value);
        }
    }
}
