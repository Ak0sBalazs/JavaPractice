package week01.arrays;

import java.util.stream.IntStream;

public class SumAll {
    public static void main(String[] args) {

        int[] num = {3, 4, 5, 6, 7};
        int sum = IntStream.of(num).sum();
        System.out.println("Sum: " + sum);
    }
}