package Udemy.Collections.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            addNumbers(nums, n);
        }
        System.out.println("Unique numbers: ");
        for (int num : nums) {
            System.out.println(num);
        }

    }
    public static void addNumbers(ArrayList<Integer> nums,int n) {
        if (!nums.contains(n)) {
            nums.add(n);
        }

    }
}
