/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jan 2, 2019 10:00:47 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan13;

/**
 *
 * @author od3ng
 */
public class MahasiswaController {
    
    private Mahasiswa model;
    private MahasiswaView view;
    
    public MahasiswaController(Mahasiswa model, MahasiswaView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setMahasiswaNim(String nim) {
        model.setNim(nim);
    }

    public void setMahasiswaNama(String nama) {
        model.setNama(nama);
    }

    public void setMahasiswaIpk(float ipk) {
        model.setIpk(ipk);
    }

    public void setMahasiswaProdi(String prodi) {
        model.setProdi(prodi);
    }
    
    public void updateView() {
        view.tampilMahasiswa(model.getNim(), model.getNama(), model.getIpk(), model.getProdi());
    }
}
