/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 31, 2018 10:52:09 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan5;

/**
 *
 * @author od3ng
 */
public class Mobil {

    String warna;
    int tahun;

    public Mobil() {
    }

    public Mobil(String warna, int tahun) {
        this.warna = warna;
        this.tahun = tahun;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahun() {
        return tahun;
    }

    public String getWarna() {
        return warna;
    }

}
