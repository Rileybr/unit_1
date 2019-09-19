package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter decimal: ");
        double number = scan.nextDouble();

        int working_number = (int) (number * 100) ;
        working_number += 5;
        double rounded_number = ((double) (working_number / 10)) / 10;

        System.out.print(number + "rounded to the nearest tenth is " + rounded_number);
    }
}
