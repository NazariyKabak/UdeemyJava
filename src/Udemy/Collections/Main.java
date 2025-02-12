package Udemy.Collections;

import Udemy.Collections.task1.Movie;
import Udemy.Collections.task2.Book;
import Udemy.Collections.task2.Store;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task12();
    }

    public void run1(){
        Movie[] movies = new Movie[] {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("12 Angry Men", "DVD", 8.9),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindlers List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

//        for(Movie movie : movies){
//            store.addMovie(movie);
//        }

    }
    public void run2(){
        City paris = new City("Paris", 2161000);
        City copy = paris;

        System.out.println(paris.equals(copy));
        copy.setPopulation(2059003);
        paris.setPopulation(3129003);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));

        System.out.println(cities.contains(paris));
    }

    public void run3(){
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);

        Store store = new Store();
        store.addBook(book1);
        store.addBook(book2);

        // Test the getBook method
        Book retrievedBook = store.getBooks(0);
        System.out.println(retrievedBook.getTitle());

        // Test the setBook method
        Book newBook = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        store.setBooks(0, newBook);

        // Verify that the book was updated
        retrievedBook = store.getBooks(0);
        System.out.println(retrievedBook.getTitle());

        // Test the contains method
        System.out.println(store.contains(book2)); // should be true before selling the book

        // Test the sellBook method
        store.sellBook("1984");
        System.out.println(store.contains(book2)); // should be false now


    }

     public static void task1(ArrayList<Integer> list, int element){
        list.add(4);
        list.add(51);
        list.add(41);
        list.add(23);
        list.add(6);
        list.remove(1);
        System.out.println("Index element: "+ list.indexOf(element));
         for (Integer i : list) {
             System.out.println(i);
         }
     }

     public static void task2(ArrayList<String> list, String element){
        list.add("Winter");
        list.add("Spring");
        list.add("Autumn");
        list.add("Summer");
        list.add("Year");
        list.remove(4);
        System.out.println("Index element: "+ list.indexOf(element));
         for (String i : list) {
             System.out.println(i);
         }
     }

        public static void task3(){
            List<Integer> list = new LinkedList<>();
            list.add(4);
            list.add(0,51);
            list.add(51);
            list.add(1,1);
            list.add(41);
            list.remove(0);
            for (Integer i : list) {
                System.out.println(i);
            }
        }

        public static void task4(){
            HashSet<String> set = new HashSet<>();
            set.add("Dota2");
            set.add("CS:GO");
            set.add("LoL");
            set.add("PUBG");
            set.add("Valorant");
            set.add("PUBG");
            boolean isDuplicate = false;
            for (String s : set) {
                if (set.contains("LoL")) {
                    isDuplicate = true;
                    break;
                }
            }
            System.out.println(isDuplicate);
//            set.remove("PUBG");
            for (String s : set) {
                System.out.println(s);
            }
        }
    public static void task5(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(51);
        set.add(41);
        set.add(23);
        set.add(6);
        for (Integer i : set) {
            System.out.println(i);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : set) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }

    public static void task6(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("BMW");
        queue.add("Audi");
        queue.add("Mercedes");
        queue.add("Toyota");
        queue.add("Lexus");
        queue.add("Toyota");
        queue.poll();
        for (String s : queue) {
            System.out.println(s);
        }
    }

    public static void task7(String k){
        Map<String, Integer> map = new HashMap<>();
        map.put("Nazarii", 22);
        map.put("Maria", 21);
        map.put("Oleh", 23);
        map.put("Max", 24);
        map.put("Vova", 45);
        System.out.println(map.get(k));
        map.remove("Oleh");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void task8(){
        List<Student> students = new ArrayList<>(List.of(
                new Student("Maria", 97.2),
                new Student("Oleh", 89.6),
                new Student("Max", 92.3),
                new Student("Vova", 85.4)));
        students.sort(Comparator.comparing(Student::getMark));
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getMark());
        }
    }

    public static void task9(){
        HashSet<String> set = new HashSet<>();
        set.add("Dota2");
        set.add("CS:GO");
        set.add("LoL");
        set.add("PUBG");
        set.add("Valorant");

        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void task10(){
        HashMap<String, ArrayList<Double>> map = new HashMap<>();
        map.put("Maria", new ArrayList<>(List.of(87.2, 99.6, 93.3, 85.4)));
        map.put("Oleh", new ArrayList<>(List.of(97.6, 89.6, 92.3, 75.7)));
        map.put("Max", new ArrayList<>(List.of(91.2, 99.6, 82.3, 87.4)));
        map.put("Vova", new ArrayList<>(List.of(99.2, 99.6, 92.3, 95.4)));

        for (Map.Entry<String, ArrayList<Double>> entry : map.entrySet()) {
            String student = entry.getKey();
            ArrayList<Double> value = entry.getValue();
            double sum = 0;
            for (Double aDouble : value) {
                sum += aDouble;
            }
            double average = sum / value.size();
            System.out.printf("Студент: %s | Середній бал: %.2f%n", student, average);
        }
    }

    public static void task11(){
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(21);
        stack.add(43);
        stack.add(15);
        stack.add(1);
        stack.pop();
        System.out.println(stack);
    }

    public static void task12(){
        TreeMap<String, String> map= new TreeMap<>();
        map.put("2025-06-27", "Happy birthday");
        map.put("2025-02-14", "Valentai day");
        map.put("2025-03-08", "8 march");
        map.put("2025-02-24", "Happy birthday my girlfriend");

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }
}
