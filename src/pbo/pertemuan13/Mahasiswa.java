/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jan 2, 2019 9:57:48 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan13;

/**
 *
 * @author od3ng
 */
public class Mahasiswa {
    
    private String nim;
    private String nama;
    private float ipk;
    private String prodi;

    public Mahasiswa(String nim, String nama, float ipk, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.prodi = prodi;
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

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    
}
