package week01.functions;

import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number to sum all number until the parameter: ");
        int num = scanner.nextInt();
        System.out.println("Your sum is: " + sum(num));
    }

    public static int sum(int calculator) {
        int all = 0;
        for (int i = 0; i <= calculator; i++) {
            all += i;
        }
        return all;

    }
}

