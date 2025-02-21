package Udemy.Collections.task4;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,2,3,4,5,3,4,8,9,8));
//        System.out.println(task5(list, 3));
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
//        System.out.println(task6(list1, 5));
//        LinkedList<Integer> list2 = new LinkedList<>();
//        task7(list2);
//        ArrayList<Integer> list3 = new ArrayList<>();
        task21(list1);

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

    public static void task9(ArrayList<Integer> list1, LinkedList<Integer> list2){
        ArrayList<Integer> mergedList = mergeLists(list1, list2);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : mergedList) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        result.forEach(System.out::println);
    }

    public static void task10(ArrayList<Integer> list, LinkedList<String> list2){
        ArrayList<Object> mergedList = new ArrayList<>();
        mergedList.addAll(list);
        mergedList.addAll(list2);
        mergedList.forEach(System.out::println);

    }

    public static void task11(LinkedList<Integer> list){
        int [] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void task12(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<>();
        String [] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.add(list.get(i));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void task14(LinkedList<Integer> list){
        list.removeIf(i -> i < 10);
        list.forEach(System.out::println);
    }

    public static void task15(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (Collections.frequency(list, i) == 1) {
                result.add(i);
            }
        }
        list.clear();
        list.addAll(result);
        list.forEach(System.out::println);
    }

    public static void task16(LinkedList<Integer> list){
        Collections.rotate(list, 3);
        list.forEach(System.out::println);
    }

    public static void task17(ArrayList<Integer> list){
        Collections.rotate(list, -2);
        list.forEach(System.out::println);
    }

    public static void task18(LinkedList<Integer> list){
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void task19(ArrayList<Integer> list){
        int max = Collections.max(list);
        int secondMax = list.stream().filter(i -> i != max).max(Integer::compareTo).get();
        System.out.println("Second max: " + secondMax);
        int min = Collections.min(list);
        int secondMin = list.stream().filter(i -> i != min).min(Integer::compareTo).get();
        System.out.println("Second min: " + secondMin);
    }
    
    public static void task20(LinkedList<Integer> list){
        int first = list.getFirst();
        int last = list.getLast();
        list.set(0, last);
        list.set(list.size() - 1, first);
        list.forEach(System.out::println);
    }
    
    public static void task21(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i+=2) {
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
        list.forEach(System.out::println);
    }

    public static void task22(LinkedList<String> list){
        list.removeIf(s -> s.length() < 5);
        list.forEach(System.out::println);
    }

    public static void task23(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (!result.contains(i)){
                result.add(i);
            }
        }
        list.clear();
        list.addAll(result);
    }

    public static void task24(LinkedList<String> list){
        String result = String.join(" ", list);
        System.out.println(result);
    }

    public static void task25(String words){
        String [] arr = words.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(s -> s.matches(".*\\d.*"));
        list.forEach(System.out::println);
    }

    public static void task26(LinkedList<Integer> list){
        Deque<Integer> stack = new LinkedList<>();
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        System.out.println(stack);
        stack.removeFirst();
        System.out.println(stack);

        Deque<Integer> queue = new LinkedList<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        System.out.println(queue);
        queue.removeFirst();
        System.out.println(queue);

    }

    public static void task27(ArrayList<Integer> list){
        Deque<Integer> stack = new LinkedList<>();

        // Add elements to the stack
        for (Integer element : list) {
            stack.addFirst(element);
        }

        // Remove elements from the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.removeFirst());
        }
    }

    public static void task28(LinkedList<Integer> list){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        frequencyMap.forEach((key, value) -> System.out.println(key + " occurs " + value + " times"));

    }

    public static void task29(ArrayList<Integer> list){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        int mostFrequent = list.get(0);
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent element: " + mostFrequent);
    }

}
