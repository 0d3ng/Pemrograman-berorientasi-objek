/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Oct 31, 2018 7:46:04 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan5.tugas;

/**
 *
 * @author od3ng
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private float ipk;

    public Mahasiswa(String nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + '}';
    }
    
}
