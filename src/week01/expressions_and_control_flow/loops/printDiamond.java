package week01.expressions_and_control_flow.loops;

import java.util.Scanner;

public class printDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows for your diamond: ");
        int num = scanner.nextInt();
        for (int a = 1; a <= num; a++) {
            for (int b = num - 1; b >= a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c < (a * 2); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num -1; i > 0; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
