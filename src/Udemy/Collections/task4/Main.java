package Udemy.Collections.task4;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,2,3,4,5,3,4,8,9,8));
//        System.out.println(task5(list, 3));
//        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
//        System.out.println(task6(list1, 5));
//        LinkedList<Integer> list2 = new LinkedList<>();
//        task7(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        task8(list3);

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

    public static void task1(LinkedList<String> names){
        names.add("Anna");                      // В кінець списку
        names.addFirst("John");                 // На початок списку
        names.addLast("Maria");                 // В кінець списку
        names.add(1, "Peter");                  // В позицію 1
        names.add("Olivia");
        names.add("James");
        names.add(3, "Sophia");                 // В позицію 3
        names.addFirst("Michael");
        names.addLast("Emma");
        names.add(5, "Isabella");
        for (String name : names) {
            System.out.println(name);
        }
    }
    public static void task2(ArrayList<Integer> list){
       for (int i = 0; i < 10; i++) {
           list.add(i);
       }
       list.remove(3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void task3(LinkedList<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Прямий порядок: ");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Зворотній порядок: ");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public static void task4(ArrayList<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Even numbers: ");
        list.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        });
    }

    public static int task5(LinkedList<Integer> list, int value){
        return list.indexOf(value);
    }

    public static boolean task6(ArrayList<Integer> list, int value){
        return list.contains(value);
    }

    public static void task7(LinkedList<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        Collections.sort(list);
        list.forEach(System.out::println);

        Collections.sort(list, Collections.reverseOrder());
        list.forEach(System.out::println);
    }

    public static void task8(ArrayList<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    

}
