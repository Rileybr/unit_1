package com.company;
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in °F");
        double fahrenheit = scan.nextDouble() ;
        double celsius;

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(Math.round(fahrenheit) + "°F = " + Math.round(celsius) + "°C");

    }
}
