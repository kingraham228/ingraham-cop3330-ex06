package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.time.Year;

public class App {
    public static void main(String[] args) {
        Input userInput = new Input();
        int userAge = userInput.getAge();
        int userRetire = userInput.getRetire();
        Year currentYear = Year.now();

        RetireMath math = new RetireMath();
        int yearsLeft = math.getYearsLeft(userRetire, userAge);
        Year retireYear = math.getRetireYear(currentYear, yearsLeft);

        System.out.printf("What is your current age? %d%n", userAge);
        System.out.printf("At what age would you like to retire? %d%n", userRetire);
        System.out.printf("You have %d years left until you can retire.%n", yearsLeft);
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear + ".");



    }
}
