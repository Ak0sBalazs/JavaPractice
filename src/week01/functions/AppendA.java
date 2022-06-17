package week01.functions;

public class AppendA {
    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(appendA(typo));


    }

    public static String appendA(String adder) {
        adder = adder + "a";
        return adder;


    }
}

