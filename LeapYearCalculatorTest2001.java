package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearCalculatorTest2001 {
    @Test
    public void test2001IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2001);
        Assert.assertFalse(result);
    }
}
