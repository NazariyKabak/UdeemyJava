package Udemy.Collections.task4;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        while (scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//            nums.add(n);
//        }
//        addNumbersSort(nums);
//        for (int num : nums) {
//            System.out.println(num);
//        }

//        ArrayList<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Adam");
//        names.add("Eve");
//        for (String name : names) {
//            System.out.println(name);
//        }
//        replacingElements(names);
//        for (String name : names) {
//            System.out.println(name);
//        }
//        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        LinkedList<Integer> list2 = new LinkedList<>(List.of(6, 7, 8, 9, 10));
//        System.out.println(mergeLists(list1, list2));
//        removeElenents(list1);
//        for (int num : list1) {
//            System.out.println(num);
//        }
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12));
//        magicList(list);
//        for (int num : list) {
//            System.out.println("Magic list:"+ num);
//        }
//        ArrayList<String> palidromWord = new ArrayList<>(List.of("madam", "hello", "world", "level"));
//        checkPalindrome(palidromWord);
//        System.out.println(reverseList(list));

        ArrayList<String> names = new ArrayList<>(List.of("John", "Eve", "John", "Adam", "Eve", "John", "Adam", "Eve", "Eve"));
        System.out.println(frequentElement(names));

    }

    public static void addNumbersSort(ArrayList<Integer> nums) {
        System.out.println("Enter a number: ");

        Collections.sort(nums);
        System.out.println("Sorted numbers: " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Sorted numbers in reverse order: " + nums);
    }

    public static void replacingElements(ArrayList<String> names) {
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter an index: ");
        int index = scanner.nextInt();
        for (int i = 0; i < names.size(); i++) {
            if (index < 0 || index >= names.size()) {
                scanner.nextLine();
                System.out.println("Invalid index");
                System.out.println("Enter a name: ");
                name = scanner.nextLine();
                System.out.println("Enter an index: ");
                index = scanner.nextInt();
            }

            names.set(index, name);
            break;
        }
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, LinkedList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static void removeElenents(ArrayList<Integer> list){
        System.out.println("Enter a number to remove: ");
        int n = scanner.nextInt();
        list.removeIf(num -> num == n);
    }

    public static void magicList(ArrayList<Integer> list) {
        list.removeIf(i -> i % 3 != 0);
    }

    public static void checkPalindrome(List<String> list) {
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        if (word.contentEquals(sb)) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static String frequentElement(ArrayList <String> list){
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        String mostFrequent = null;
        int maxFrequency = 0;
        for (String element : list) {
            int frequency = frequencyMap.get(element);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = element;
            }
        }
        return mostFrequent;
    }

}
