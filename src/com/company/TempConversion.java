package com.company;

public class TempConversion {
    public static void main(String[] args){
        double fahrenheit = 78;
        double celsius;

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(Math.round(fahrenheit) + "°F = " + Math.round(celsius) + "°C");

    }
}
