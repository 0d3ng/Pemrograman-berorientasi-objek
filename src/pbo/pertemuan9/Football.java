/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 26, 2018 10:46:34 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan9;

/**
 *
 * @author od3ng
 */
public interface Football extends Sports {

    public void homeTeamScored(int points);

    public void visitingTeamScored(int points);

    public void endOfQuarter(int quarter);
}
