package Udemy.array;

public class IntroToArrays {
    public static void main(String[] args) {
        String kingdom1 = "Mercia";
        String kingdom2 = "Wessex";
        String kingdom3 = "Northumbria";
        String kingdom4 = "East Anglia";
        String []kingdoms = {kingdom1, kingdom2, kingdom3, kingdom4};
        for (String kingdom : kingdoms) {
            System.out.println(kingdom);
        }
    }
}