package Prac.StringPrac;

import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(task9("listen", "silent"));
    }

    public static String task5(String input){
        return input.replaceAll("[aeoyiAEOYI]", "");
    }

    public static String task7(String input){
        StringBuilder sb = new StringBuilder(" ");
        String [] arr = input.split(" ");

        for (String s : arr) {
            char [] temp = new char[s.length()];
            char [] charArr = new char[s.length()];

            for (int j= 0;j<s.length();j++){
                temp[j] = s.charAt(j);
            }

            for (int k =0; k<s.length();k++){
                charArr[k] = temp[s.length()-1-k];
            }

            String reversed = new String(charArr);
            sb.append(reversed);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String task8(String input){
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i =1; i<input.length();i++){
            if (input.charAt(i) == input.charAt(i-1)){
                count++;
            }else {
                compressed.append(input.charAt(i-1)).append(count);
                count=1;
            }
        }
        compressed.append(input.charAt(input.length()-1)).append(count);
        return compressed.toString();
    }

    public static boolean task9(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.length() != word2.length()){
            return false;
        }

        char [] arr1 = word1.toCharArray();
        char [] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
