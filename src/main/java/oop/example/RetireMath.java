package oop.example;
import java.time.Year;
public class RetireMath {

    public int getYearsLeft(int retire, int age){
        return retire - age;
    }

    public Year getRetireYear (Year currentYear, int yearsLeft){
        Year retireYear = currentYear.plusYears(yearsLeft);
        return retireYear;
    }

}
