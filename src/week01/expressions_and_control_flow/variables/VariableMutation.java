package week01.expressions_and_control_flow.variables;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10

        System.out.println(a + 10);

        int b = 100;
        // make b smaller by 7

        System.out.println(b - 7);

        int c = 44;
        // please double c's value

        System.out.println(c * 2);

        int d = 125;
        // please divide by 5 d's value

        System.out.println(d / 5);

        int e = 8;
        // please cube of e's value

        System.out.println(e * e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean isBigger = f1 > f2;
        System.out.println("f1 is bigger than f2 is: " + isBigger);

        int g1 = 350;
        int g2 = 200;
        boolean isDoubleBigger = (g2 * 2) > g1;
        System.out.println("g2 double is bigger than g1 is: " + isDoubleBigger);
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        boolean divisor = (h % 11) == 0;
        System.out.println("11 is a divisor: " + divisor);
        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        boolean isHigherDouble = (i1 * i1) > (i2 * i2);
        System.out.println("i1 is higher than i2 squared: " + isHigherDouble);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        boolean jDivide = j % 3 == 0 || j % 5 == 0;
        System.out.println("1521 can be divided by 3 or 5 is " + jDivide);
        // tell if j is dividable by 3 or 5 (print as a boolean)
    }


}

