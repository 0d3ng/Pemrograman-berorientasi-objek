/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 26, 2018 9:47:22 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan9;

/**
 *
 * @author od3ng
 */
public class Salary extends Employee {

    private double salary;

    public Salary(double salary, String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double hitungGaji() {
        System.out.println("" + getClass().getName());
        return salary * 1000;
    }

}
