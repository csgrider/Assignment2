package edu.bsu.cs222;

public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        if(year % 400 == 0){
            if(year % 100 != 0){
                if(year % 4 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
