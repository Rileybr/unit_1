package com.company;

import java.util.Scanner;

public class RoundNegatives {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a negative decimal number: ");
        double number = scan.nextDouble();

        int rounded_number = (int) (Math.round(number));
        System.out.print(number + " rounded to a whole number: " + rounded_number);
    }
}
