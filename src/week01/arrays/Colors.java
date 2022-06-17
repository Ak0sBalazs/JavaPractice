package week01.arrays;

public class Colors {
    public static void main(String[] args) {
        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"},
        };
        for (int i = 0; i < colors[0].length; i++)
            System.out.print(colors[0][i] + " ");
        System.out.println(colors.length);
    }
}