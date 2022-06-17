package week01.expressions_and_control_flow.variables;

public class Swap {
    public static void main(String[] args) {
        // week01.expressions_and_control_flow.variables.Swap the values of the variables
        int a = 123;
        int b = 526;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
