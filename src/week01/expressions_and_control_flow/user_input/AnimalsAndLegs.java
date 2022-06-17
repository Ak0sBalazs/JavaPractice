package week01.expressions_and_control_flow.user_input;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number of chicken on the farm: ");
        Double chicken = scanner.nextDouble();
        System.out.println("Please provide the number of pigs on the farm: ");
        Double pigs = scanner.nextDouble();
        System.out.println("There are " + ((chicken*2)+(pigs*4))+ " animal legs on the farm");
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
