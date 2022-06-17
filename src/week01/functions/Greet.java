package week01.functions;

public class Greet {
    public static void main(String[] args) {
        String a1 = "Green Fox";
        System.out.println(greet(a1));

    }

    public static String greet(String gf) {
        gf ="Greetings dear "+gf;
        return gf;


    }
}
