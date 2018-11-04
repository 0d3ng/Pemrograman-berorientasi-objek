/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 3, 2018 5:08:39 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan6;

/**
 *
 * @author od3ng
 */
public class Lingkaran extends BangunDatar {

    private float sisi;
    //    method getter setter

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float hitungLuas() {
        return (float) (Math.PI * (Math.pow(sisi, sisi)));
    }

    @Override
    public float hitungKeliling() {
        return (float) (2 * Math.PI * sisi);
    }
}
