package week01.expressions_and_control_flow.variables;

public class Cuboid {
    public static void main(String[] args) {
        double a;
        a=10;


        double surfaceArea = (6*(a*a));
        double volume = (a*a*a);
        System.out.println("Surface Area: "+ surfaceArea);
        System.out.println("Valume: "+ volume);
    }
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then you program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000
    }
