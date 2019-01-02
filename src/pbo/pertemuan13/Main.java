/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jan 2, 2019 10:04:35 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan13;

/**
 *
 * @author od3ng
 */
public class Main {
    
    public static void main(String[] args) {
        Mahasiswa model = getMahasiswa();
        MahasiswaView view = new MahasiswaView();
        MahasiswaController controller = new MahasiswaController(model, view);
        controller.updateView();
        controller.setMahasiswaIpk(4F);
        controller.setMahasiswaNama("Noureen Akleema Shannum");
        controller.updateView();
    }
    
    private static Mahasiswa getMahasiswa() {
        Mahasiswa m = new Mahasiswa("075410099", "Noprianto", 3.75F, "Teknik Informatika");
        return m;
    }
    
}
