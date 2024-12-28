package Udemy.MapCollection.prac;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        wordFrequencyInTheText();
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 5};
//        findDuplicates(arr);
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Nazarii", 12);
//        map.put("Oleg", 10);
//        map.put("Igor", 11);
//        map.put("Vlad", 9);
//        findMaxValue(map);

//        TreeMap<String, Integer> map = new TreeMap<>();
//        map.put("Kyiv", 3000000);
//        map.put("Lviv", 1000000);
//        map.put("Odessa", 1500000);
//        map.put("Kharkiv", 2000000);
//        sortedNameCity(map);

//        TreeMap<Integer, String> map = new TreeMap<>();
//        map.put(1, "Kyiv");
//        map.put(2, "Lviv");
//        map.put(3, "Odessa");
//        map.put(4, "Kharkiv");
//        filteringKeyRange(map, 2, 3);

//        TreeMap<String, String> map = new TreeMap<>();
//        map.put("0980401397", "Nazarii");
//        map.put("0980401398", "Oleg");
//        map.put("0980401399", "Igor");
//        map.put("0980401400", "Vlad");
//        findNumberPhone(map, "Igor");

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Nazarii", 12);
        map1.put("Oleg", 10);
        map1.put("Igor", 11);
        map1.put("Vlad", 9);

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("Kyiv", 3000000);
        map2.put("Lviv", 1000000);
        map2.put("Odessa", 1500000);
        map2.put("Kharkiv", 2000000);
        merginMaps(map1, map2);

    }

    public static void wordFrequencyInTheText(){
        String word = scanner.nextLine();
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        while (!word.equals("exit")){
            if (wordFrequency.containsKey(word)){
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
            word = scanner.nextLine();
        }
        System.out.println(wordFrequency);
    }

    public static void findDuplicates(int [] arr){
        HashMap<Integer, Integer> duplicates = new HashMap<>();
        for (int j : arr) {
            if (duplicates.containsKey(j)) {
                duplicates.put(j, duplicates.get(j) + 1);
            } else {
                duplicates.put(j, 1);
            }
        }
        System.out.println(duplicates);

    }

    public static void findMaxValue(HashMap<String, Integer> map){
        int max = 0;
        String key = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                key = s;
            }
        }
        System.out.println(key + " " + max );
    }

    public static void sortedNameCity(TreeMap<String, Integer> map){
        map.keySet().stream().sorted().forEach(key -> System.out.println(key + " " + map.get(key)));
        System.out.println(map);

    }

    public static void filteringKeyRange(TreeMap<Integer, String> map, int from, int to){
        map
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey() >= from && entry.getKey() <= to)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }

    public static void findNumberPhone(TreeMap<String, String> map, String name){
        if (map.containsValue(name)){
            map.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().equals(name))
                    .forEach(entry -> System.out.println(entry.getKey()));
        } else {
            System.out.println("Name not found");
        }

    }

    public static void merginMaps(HashMap<String, Integer> map1, TreeMap<String, Integer> map2){
        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));
        System.out.println(map1);

    }

}
