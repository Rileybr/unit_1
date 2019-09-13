package com.company;

public class Painting {
    public static void main(String [] args){
        double length;
        double width;
        double height;
        int door_number;
        int window_number;
        int door_area = 20;
        int window_area = 15;
        double room_surface_area;
        final int paint;
        double paint_needed;
        length = 32;
        width = 40;
        height = 16;
        door_number = 2;
        window_number = 4;
        room_surface_area = length*width + 2*length*height + 2*width*height - door_area*door_number - window_area*window_number;
        System.out.print("the room is ");
        System.out.print(room_surface_area);
        System.out.println(" square feet.");
        paint = 350;
        paint_needed = room_surface_area/paint;
        System.out.print("you will need ");
        System.out.print(paint_needed);
        System.out.println(" gallons of paint. :)");


    }
}
