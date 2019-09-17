package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = scan.nextInt();
        System.out.println("Enter length:");
        int length = scan.nextInt();
        int area;
        area = width * length;
        System.out.println("Area = " + area);
    }
}
