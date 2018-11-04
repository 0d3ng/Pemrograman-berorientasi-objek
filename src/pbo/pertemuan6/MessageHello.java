/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 4, 2018 9:35:36 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan6;

/**
 *
 * @author od3ng
 */
public class MessageHello extends Message {

    public MessageHello(String name) {
        super(name);
    }

    public static void main(String[] args) {
        MessageHello hello = new MessageHello("Hello UTY");
        System.out.println("" + hello.getName());
    }

}
