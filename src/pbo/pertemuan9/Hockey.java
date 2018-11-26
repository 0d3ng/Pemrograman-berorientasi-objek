/*
 * Pemrograman-berorientasi-objek

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Nov 26, 2018 10:47:08 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.pertemuan9;

/**
 *
 * @author od3ng
 */
public interface Hockey extends Sports {

    public void homeGoalScored();

    public void visitingGoalScored();

    public void endOfPeriod(int period);

    public void overtimePeriod(int ot);
}
