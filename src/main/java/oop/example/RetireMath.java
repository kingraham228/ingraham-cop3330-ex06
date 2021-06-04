package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
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
