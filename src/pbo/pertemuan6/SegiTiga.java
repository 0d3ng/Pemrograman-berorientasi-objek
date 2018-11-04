/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 4, 2018 9:27:08 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan6;

/**
 *
 * @author od3ng
 */
public class SegiTiga extends BangunDatar {

    private float alas;
    private float tinggi;

    public float getAlas() {
        return alas;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public float hitungKeliling() {
        return super.hitungKeliling(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float hitungLuas() {
        return (float) (0.5 * alas * tinggi);
    }

}
