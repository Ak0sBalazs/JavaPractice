package week01.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number to factorial: ");
        int number = scanner.nextInt();
        System.out.println("Your Factorial equals to: "+(factorial(number)));
    }

    public static int factorial(int calculator) {
        int all = 1;
        for (int i = 1; i <= calculator; i++) {
            all *= i;
        }
        return all;
    }
}

