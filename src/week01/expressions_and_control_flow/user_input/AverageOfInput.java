package week01.expressions_and_control_flow.user_input;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Put the first number here: ");
        double number1 = scanner.nextDouble();
        System.out.print("Put the second number here: ");
        double number2 = scanner.nextDouble();
        System.out.print("Put the third number here: ");
        double number3 = scanner.nextDouble();
        System.out.print("Put the fourth number here: ");
        double number4 = scanner.nextDouble();
        System.out.print("Put the fifth number here: ");
        double number5 = scanner.nextDouble();

        double sum = (number1 + number2 + number3 + number4 + number5);
        System.out.println("Sum: " + sum+", Average: "+ (sum/5));


        System.out.println("Sum: " + (number1 + number2 + number3 + number4 + number5) + ", Average: " + (sum / 5));
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
    }
}
