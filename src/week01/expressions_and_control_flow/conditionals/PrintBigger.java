package week01.expressions_and_control_flow.conditionals;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Please provide a number: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        System.out.println("Please provide another number: ");
        double number2 = scanner.nextDouble();

        if (number1>number2){
            System.out.println(number1+ " is bigger! ");
        } else if (number1<number2){
            System.out.println(number2+ " is bigger! ");
        }
    }
}
