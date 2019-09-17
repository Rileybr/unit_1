package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args){
        final double TAXRATE = 0.0825;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price:");
        double price = scan.nextDouble();
        double tax;
        double total;

        tax = price * TAXRATE;
        total = price + tax;
        System.out.println("Price: $" + price);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);

    }
}
