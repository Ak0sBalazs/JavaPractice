package week01.expressions_and_control_flow.conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number to decide if the number is odd or eve: ");
        double number = scanner.nextDouble();

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else if(number % 2 == 1 ) {
            System.out.println("Number is Odd");
        }
    }
}