/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 6, 2018 1:38:33 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan7;

import pbo.pertemuan6.BangunDatar;
import pbo.pertemuan6.PersegiPanjang;

/**
 *
 * @author od3ng
 */
public class Polimorfisme {

    public static void main(String[] args) {
        MediaKomunikasi mk = new MediaKomunikasi();
        mk.send();
        mk = new Sms();
        mk.send();
        mk = new Telfon();
        mk.send();
        mk = new Whatsapp();
        mk.send();
        
    }
}
