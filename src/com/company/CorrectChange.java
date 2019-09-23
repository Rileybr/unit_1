package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a whole number of cents:");
        int cents = scan.nextInt();
        int dollar;
        int quarters;
        int dimes;
        int nickles;
        int pennies;

        dollar = cents / 100;
        cents -= (dollar * 100);

        quarters = cents / 25;
        cents -= (quarters * 25);

        dimes = cents / 10;
        cents -= (dimes * 10);

        nickles = cents / 5;
        cents -= (nickles * 5);

        pennies = cents;

        System.out.print("You have " + dollar + " dollars, " + quarters + " quarters, " + dimes + " dimes, ");
        System.out.print(nickles + " nickles, " + pennies + " and pennies.");



    }
}
