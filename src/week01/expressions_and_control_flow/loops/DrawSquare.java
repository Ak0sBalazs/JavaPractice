package week01.expressions_and_control_flow.loops;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int input = scanner.nextInt();

        for (int rowCount = 1; rowCount <= input; rowCount++) {
            for (int columnCount = 1; columnCount <= input; columnCount++) {
                if (rowCount == 1 || rowCount == input || columnCount == 1 || columnCount == input) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Write a program that draws a square like this:
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as lineCount is
