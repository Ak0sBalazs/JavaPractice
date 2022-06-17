package week01.expressions_and_control_flow.loops;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++)
        {
            sum += scanner.nextInt();
        }
        double avr = sum / num;
        System.out.println("Sum =" + sum + ", Average: " + avr);
    }
}
