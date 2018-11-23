/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 1, 2018 4:41:51 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan6;

/**
 *
 * @author od3ng
 */
public class PersegiPanjang extends BangunDatar {

    private float panjang;
    private float lebar;
//    methode getter setter

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    public float hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public float hitungKeliling() {
        return 2*(panjang+lebar);
    }
}
