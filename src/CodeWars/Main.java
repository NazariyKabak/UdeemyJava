package CodeWars;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        String original = "The quick brown fox jumps over the lazy dog.";
        System.out.println(reverseWords(original));
    }

    public static String calculateSlope(int[] points) {
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];

        if (x2==x1){
            return "undefined";
        }
        int slope = (y2-y1)/(x2-x1);
        return Integer.toString(slope);
    }

    public int pythagoreanTriple(int[] triple){
        Arrays.sort(triple);
        int a= triple[0];
        int b= triple[1];
        int c= triple[2];

        if (a*a+b*b==c*c){
            return 1;
        }else {
            return 0;
        }

    }


    public static String reverseWords(final String original) {
        if (original.isEmpty()) return original;

        String[] words = original.split("(?<= )|(?= )");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            if (word.isBlank()) {
                reversed.append(word);
            } else {
                reversed.append(new StringBuilder(word).reverse());
            }
        }
        return reversed.toString().trim();
    }

}

