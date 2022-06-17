package week01.expressions_and_control_flow.loops;

import java.util.Scanner;

public class DrawDiagonal {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("input: ");
    int input = scanner.nextInt();

    for (int rowCount = 1; rowCount <= input; rowCount++) {
        for (int columnCount = 1; columnCount <= input; columnCount++) {
            if (rowCount == 1 || rowCount == input || columnCount == 1 || columnCount == input || columnCount==rowCount )  {
                System.out.print("%");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
