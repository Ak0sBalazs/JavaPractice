package week01.expressions_and_control_flow.user_input;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello please give me your distance in miles to convert: ");
        double miles = scanner.nextDouble();
        double milesToKm = (miles * 1.60934);
        System.out.println(miles + " miles equals to " + milesToKm +"kilometers");


        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}
