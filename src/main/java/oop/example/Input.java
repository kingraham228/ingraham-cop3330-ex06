package oop.example;


import java.util.Scanner;

public class Input {


    public int getAge() {
        Scanner input = new Scanner(System.in);
        int userAge;
        do {

            System.out.println("What is your current age? ");
            while (!input.hasNextInt()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid age.");
            }
            userAge = input.nextInt();
        } while (userAge < 0);
        return userAge;
    }

    public int getRetire() {
        Scanner input = new Scanner(System.in);
        int userRetire;
        do {

            System.out.println("At what age would you like to retire? ");
            while (!input.hasNextInt()) {
                String str2 = input.next();
                System.out.println(str2 + " is not a valid age.");
            }
            userRetire = input.nextInt();
        } while (userRetire < 0);

        return userRetire;


    }


}
