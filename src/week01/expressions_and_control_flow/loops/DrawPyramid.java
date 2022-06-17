package week01.expressions_and_control_flow.loops;

public class DrawPyramid {
    public static void main(String[] args) {
        int lineCount = 4;

        for (int i = 1; i <= lineCount; i++) {
            int spaces = lineCount-i;
            int astrix = i * 2 - 1;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= astrix; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

// Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
