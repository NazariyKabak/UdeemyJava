package Epam.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double [] arr = new double[5];
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter a number: ");
//            arr[i] = scanner.nextDouble();
//        }
//        for(double num : arr) {
//            System.out.println(num);
//        }
//        scanner.close();+
//
//        double [] arr2 = new double[5];
//        Random random = new Random();
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random.nextDouble();
//        }
//        for(double num : arr2) {
//            System.out.println(num);
//        }

        double [] arr3 = new double[10];
        for (int i = 0; i < arr3.length; i++) {
           while (!scanner.hasNextDouble()){
               scanner.nextLine();
               System.out.print("arr[" + i + "] = ");
           }
              arr3[i] = scanner.nextDouble();
        }

        for (int i =arr3.length-1; i >= 0; i--) {
            System.out.println("arr[" + i + "] = " + arr3[i]);
        }
    }
}
