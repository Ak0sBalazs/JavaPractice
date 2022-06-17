package week01.expressions_and_control_flow.user_input;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please write you name here: ");
        String yourName = scanner.nextLine();
        System.out.println("Hello, " + yourName + " !");

    }
}
