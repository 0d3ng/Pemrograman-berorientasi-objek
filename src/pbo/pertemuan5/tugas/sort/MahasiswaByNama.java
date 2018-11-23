/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 4, 2018 10:34:35 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan5.tugas.sort;

import java.util.Comparator;
import pbo.pertemuan5.tugas.Mahasiswa;

/**
 *
 * @author od3ng
 */
public class MahasiswaByNama implements Comparator<Mahasiswa> {

    @Override
    public int compare(Mahasiswa o1, Mahasiswa o2) {
        return o1.getNama().compareTo(o2.getNama());
    }

}
