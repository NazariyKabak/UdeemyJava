package Prac.Loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loops {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task9();

    }

    public static int task2(){
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int task3(){
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void task4(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }

    public static boolean task5(){
        int n = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void task6(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void task7(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void task8(){
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void task9(){
        int n = scanner.nextInt();
        for (int i = 2; i<=n; i++){
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }

    }

    public static boolean task10(){
        int n = scanner.nextInt();
        boolean isPalindrome = true;
        int temp = n;
        int reverse = 0;
        while (temp!=0){
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp/=10;
        }
        if (reverse!=n){
            isPalindrome = false;
        }
        return isPalindrome;
    }

    public static void task11(){
        int n1 = 0;
        int n2 = 1;
        int next;
        for (int i = 1; i <= 10; i++) {
            System.out.print(n1+" ");
            next = n1+n2;
            n1 = n2;
            n2 = next;
        }
    }

    public static void task12(){
        int n = scanner.nextInt();
        for (int i =1; i<=n; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }

    public static int [][] task13(){
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        Random random = new Random();
        int [][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

    public static int [] task14(int [] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void task15(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void task16(){
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Число: "+i);
            System.out.println("Квадрат: "+i*i);
            System.out.println("Куб: "+i*i*i);

        }
    }

    public static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }
    public static void task17(){
        int userChoice = scanner.nextInt();
        int randomNumber = generateRandomNumber();
        while (true) {
            if (userChoice == randomNumber) {
                System.out.println("Correct!");
                break;
            } else if (userChoice > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
            userChoice = scanner.nextInt();
        }
    }

    public static int [][] task20(){
       int n = scanner.nextInt();
       int [][] matrix = new int[n][n];
       int value = 1;
       int top = 0;
       int bottom = n-1;
       int left = 0;
       int right = n-1;
       while (value<=n*n){
           for (int i = left; i <= right; i++){
               matrix[top][i] = value;
               value++;
           }
           top++;
           for (int i = top; i <= bottom; i++){
               matrix[i][right] = value;
               value++;
           }
           right--;
           for (int i = right; i >= left; i--){
               matrix[bottom][i] = value;
               value++;
           }
           bottom--;
           for (int i = bottom; i >= top; i--){
               matrix[i][left] = value;
               value++;
           }
           left++;
       }

         return matrix;
    }

    public static void task21(int [] arr){
        int sumEven = 0;
        int sumOdd = 0;
        for (int i : arr) {
            if(i%2==0){
                sumEven+=i;
            }else {
                sumOdd+=i;
            }
        }
        System.out.println("Sum of even numbers: "+sumEven);
        System.out.println("Sum of odd numbers: "+sumOdd);
    }

    public static void task22(){
        int n = scanner.nextInt();
        boolean isPerfect = false;
        int sum = 0;
        for (int i = 1; i < n; i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            isPerfect = true;
        }
    }

    public static void task23(int [][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Calculate sum of each row
        for (int i = 0; i < rows; i++) {
            int sumRow = 0;
            for (int j = 0; j < columns; j++) {
                sumRow += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sumRow);
        }

        // Calculate sum of each column
        for (int j = 0; j < columns; j++) {
            int sumColumn = 0;
            for (int i = 0; i < rows; i++) {
                sumColumn += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + sumColumn);
        }
    }



}
