package com.company;

import java.util.Scanner;

public class FindTheAverage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four values:");
        System.out.print("Value 1:   ");
        double average = scan.nextDouble();
        System.out.print("Value 2:   ");
        average += scan.nextDouble();
        System.out.print("Value 3:   ");
        average += scan.nextDouble();
        System.out.print("Value 4:   ");
        average += scan.nextDouble();
        average /= 4;
        System.out.println("Average: " + average);

    }
}
