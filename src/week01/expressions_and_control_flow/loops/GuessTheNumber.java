package week01.expressions_and_control_flow.loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = 69;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the stored number: ");
        int guess = scanner.nextInt();

        while (guess != num) {
            if (guess < num) {
                System.out.println("Number is higher");
            } else if (guess > num) {
                System.out.println("Number is lower");
            }
            guess = scanner.nextInt();
        }
        System.out.println("You found the number: " + num);
    }

}