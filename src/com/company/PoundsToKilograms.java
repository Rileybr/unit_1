package com.company;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in lbs:");
        double lbs = scan.nextDouble();
        double kg;
        kg = lbs / 2.205;
        System.out.println(lbs + " pounds = " + kg + " kilograms");
    }
}
