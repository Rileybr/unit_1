package com.company;

public class TotalWithTax {
    public static void main(String[] args){
        final double TAXRATE = 0.0825;
        double price = 52.75;
        double tax;
        double total;

        tax = price * TAXRATE;
        total = price + tax;
        System.out.println("Price: $" + price);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);

    }
}
