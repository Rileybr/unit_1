package com.company;
import java.util.Scanner;



public class Painting {
    public static void main(String [] args){
        double length;
        double width;
        double height;
        int door_number;
        int window_number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter room length in feet:");
        length = scan.nextDouble();
        System.out.println("Enter room width in feet:");
        width = scan.nextDouble();
        System.out.println("Enter room height in feet:");
        height = scan.nextDouble();
        System.out.println("Enter number of doors");
        door_number = scan.nextInt();
        System.out.println("Enter number of windows");
        window_number = scan.nextInt();
        int door_area = 20;
        int window_area = 15;
        double room_surface_area;
        final int paint;
        double paint_needed;
        room_surface_area = length*width + 2*length*height + 2*width*height - door_area*door_number - window_area*window_number;
        System.out.print("the room is ");
        System.out.print(room_surface_area);
        System.out.println(" square feet.");
        paint = 350;
        paint_needed = room_surface_area/paint;
        System.out.print("you will need ");
        System.out.print(Math.round(paint_needed));
        System.out.println(" gallons of paint. :)");


    }
}
