package week01.expressions_and_control_flow.loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a program that asks for two numbers
        System.out.println("Add number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Add number 2: ");
        double num2 = scanner.nextDouble();

        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        if (num2<num1) {
            System.out.println("The second number should be bigger");
        } else if (num2>num1) {
            while (num1<=num2) {
                System.out.println(num1);
                num1++;
            }
        }
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
    }
}
