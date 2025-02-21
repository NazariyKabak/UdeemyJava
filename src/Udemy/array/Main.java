package Udemy.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        int[] arr = {1, 0, 0, 1, 2, 3, 6, 6, 9};
        System.out.println(Arrays.toString(task10(arr)));
    }

    private void run2() {
        String[] fruits = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
    }

    private void run3() {
        String[] fruits = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");
        String element = scanner.nextLine();
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(element)) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
    }

    public void run4() {
        int highScore = 0;
        int seat = 0;
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            }
        }
        System.out.println(Arrays.toString(scores));
        System.out.println(highScore);
        System.out.println(seat);

    }

    public static int randomNumber() {
        double v = Math.random() * 50000;
        return (int) v;
    }

    public void run5() {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins++;
            } else {
                losses++;
            }
        }
        System.out.println(wins);
        System.out.println(losses);
    }

    public void run6() {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};
        for (int i = 0; i < 3; i++) {
            System.out.println(apples[i] + " " + price[i]);
        }
    }

    public void run7() {
        String[] menu = {"Espresso", "Iced coffee", "Macchiato"};
        menu[2] = "Late";
        System.out.println(Arrays.toString(menu));
        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "Tea";
        newMenu[4] = "Ice Latte";
        System.out.println(Arrays.toString(newMenu));
    }

    public void run8() {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];
        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i];
            afterTax[i] = price[i] + price[i] * 0.13;
            System.out.println(afterTax[i]);
        }
    }

    public void run9() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] toppings = new String[size];
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". ");
            toppings[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(toppings));
    }

    public void run10() {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;
        printTicket(ticket);
        printTicket(ticket2);

    }

    public static void printTicket(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static double[] celciusToFahrenheit(double[] celcius) {
        double[] farenheit = new double[celcius.length];
        for (int i = 0; i < farenheit.length; i++) {
            farenheit[i] = celcius[i];
            farenheit[i] = (celcius[i] / 5 * 9) + 32;
        }
        return farenheit;

    }

    public static void printTemperature(double[] arr, String type) {
        for (double element : arr) {
            System.out.println(type + ":" + element);
        }
    }

    public void run11() {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] farenheit = celciusToFahrenheit(celsius);
        printTemperature(celsius, "Celcius");
        printTemperature(farenheit, "Farenheit");
    }

    public void run12() {
        int[][] nums = new int[3][4];
        nums[0][0] = 2;
        nums[0][1] = 1;
        nums[0][2] = 323;
        nums[0][3] = 4;
        nums[1][3] = 10;
        nums[2][2] = 134;
        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));
    }

    public void run13() {
        double[][] nums = new double[3][5];
        nums[0][0] = 12.99;
        nums[0][1] = 8.99;
        nums[0][2] = 9.99;
        nums[0][3] = 10.49;
        nums[0][4] = 11.99;
        nums[1][0] = 0.99;
        nums[1][1] = 1.99;
        nums[1][2] = 2.49;
        nums[1][3] = 1.49;
        nums[1][4] = 2.99;
        nums[2][0] = 8.99;
        nums[2][1] = 7.99;
        nums[2][2] = 9.49;
        nums[2][3] = 9.99;
        nums[2][4] = 10.99;


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                switch (i) {
                    case 0:
                        System.out.print("Baking: ");
                        break;
                    case 1:
                        System.out.print("Beverage: ");
                        break;
                    case 2:
                        System.out.print("Cereals: ");
                        break;
                }
                System.out.println(nums[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int randomNumber2() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public void run14() {
        int[][] array = {
                {48, 56, 56, 76, 0, 81, 51, 81, 99, 70},
                {38, 52, 73, 6, 10, 56, 1, 71, 47, 9},
                {85, 35, 47, 98, 91, 25, 69, 52, 2, 93}
        };
        print2DArray(array);
        int[][] arr = new int[100][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNumber();
            }
        }
        print2DArray(arr);
    }

    public void run15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        String[][] database = new String[4][3];
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database[i].length; j++) {
                database[i][j] = scanner.nextLine();
            }
        }
//        print2DArrayDatabase(database);

        System.out.println("Who do you inf on");
        String name = scanner.nextLine();
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database[i].length; j++) {

                if (database[i][0].equals(name)) {
                    System.out.println(database[i][0]);
                    System.out.println(database[i][1]);
                    System.out.println(database[i][2]);
                }
            }
        }


    }

    public static void print2DArrayDatabase(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public void run16() {
        char[][] ticTac = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        printBoard(ticTac);
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Turn: X");
                int[] spot = askUser(ticTac);
                ticTac[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("Turn: O");
                int[] spot = askUser(ticTac);
                ticTac[spot[0]][spot[1]] = 'O';
            }
            printBoard(ticTac);
            int count = checkWin(ticTac);
            if (count == 3) {
                System.out.println("X wins!");
                break;
            } else if (count == -3) {
                System.out.println("O wins");
                break;
            }
        }


    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] askUser(char[][] board) {
        System.out.print(" pick the row and column:");
        int row = scanner.nextInt();
        int element = scanner.nextInt();
        while (board[row][element] == 'X' || board[row][element] == 'O') {
            System.out.print("Spot taken, try again!: ");
            row = scanner.nextInt();
            element = scanner.nextInt();
        }
        return new int[]{row, element};
    }

    public static int checkWin(char[][] board) {
        int rows = checkRows(board);
        if (Math.abs(rows) == 3) {
            return rows;
        }
        int columns = checkColumns(board);
        if (Math.abs(columns) == 3) {
            return columns;
        }

        int left = checkLeft(board);
        if (Math.abs(left) == 3) {
            return left;
        }
        int right = checkRight(board);
        if (Math.abs(right) == 3) {
            return right;
        }
        return -1;
    }

    public static int checkRows(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;

                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }
        return count;
    }

    public static int checkColumns(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;

                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }
        return count;
    }

    public static int checkLeft(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if (board[i][i] == 'O') {
                count--;
            }
        }
        return count;
    }

    public static int checkRight(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[2 - i][i] == 'X') {
                count++;
            } else if (board[2 - i][i] == 'O') {
                count--;
            }
        }
        return count;
    }

    public void wb6_1() {
        String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};
        System.out.println(seats[0] + " will sit in seat 0");
        System.out.println(seats[1] + " will sit in seat 1");
        System.out.println(seats[2] + " will sit in seat 2");
        System.out.println(seats[3] + " will sit in seat 3");
    }

    public void wb6_2() {
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        for (String student : students) {
            System.out.println(student + " will sit in seat ");
        }
    }

    public void wb6_3() {
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");
        for (String item : aisle) {
            if (item.equals("coffee")) {
                System.out.println("Yes, in aisle ");
            }
        }
    }

    public void wb6_4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Grocers.");
        System.out.println("What can I help you find?");
        String response = scanner.nextLine();
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        for (int i = 0; i < aisle.length; i++) {
            if (aisle[i].equals(response)) {
                System.out.println("We have that in aisle " + i);
            }
        }
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 49999) + 1;
    }

    public void wb6_5() {
        int[] nums = new int[10];
        int highScore = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = generateRandomNumber();
            if (nums[i] > highScore) {
                highScore = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(highScore);
        wb6_6(nums);

    }

    public void wb6_6(int[] arr) {
        int seat = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[seat]) {
                seat = i;
            }
        }
        System.out.println("The highest score is " + arr[seat] + " and the seat is " + seat);
    }

    public void wb6_7() {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        for (String s : record) {
            if (s.equals("WIN")) {
                wins++;
            } else {
                losses++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public void wb6_8() {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};
        for (int i = 0; i < apples.length; i++) {
            System.out.println(apples[i] + " " + price[i]);
        }
    }

    public void wb6_9() {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];
        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i];
            afterTax[i] = price[i] + price[i] * 0.13;
            System.out.println(afterTax[i]);
        }
    }

    public void wb6_10() {
        String[] toppings = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < toppings.length; i++) {
            System.out.println("Enter topping " + i);
            toppings[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(toppings));
    }


    public void wb6_11(double[] celcius) {
        double[] farenheit = new double[celcius.length];
        for (int i = 0; i < farenheit.length; i++) {
            farenheit[i] = celcius[i];
            farenheit[i] = (celcius[i] / 5 * 9) + 32;
        }
        printTemperature(celcius, "Celcius");
        printTemperature(farenheit, "Farenheit");
    }

    public void wb6_12() {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        printTicketNumbers(ticket);
        printTicketNumbers(ticket2);

    }

    public void printTicketNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void wb6_13() {
        double[][] nums = {
                {12.99, 8.99, 9.99, 10.49, 11.99},
                {0.99, 1.99, 2.49, 1.49, 2.99},
                {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        System.out.println("Baking" + nums[0][0] + " " + nums[0][1] + " " + nums[0][2] + " " + nums[0][3] + " " + nums[0][4]);
        System.out.println("Beverage" + nums[1][0] + " " + nums[1][1] + " " + nums[1][2] + " " + nums[1][3] + " " + nums[1][4]);
        System.out.println("Cereals" + nums[2][0] + " " + nums[2][1] + " " + nums[2][2] + " " + nums[2][3] + " " + nums[2][4]);
    }

    public void wb6_14(int[][] arr) {

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = randomNumber();
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[] task1(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static int task2(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static double task3(double[] arr) {
        double sum = 0;
        for (double element : arr) {
            sum += element;
        }
        return sum / arr.length;
    }

    public static int[] task4(int[] arr) {
        int countEven = 0;
        int countOdd = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[]{countEven, countOdd};
    }

    public static double[] task5(double[] arr) {
        int unique = 0;
        double[] temp = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[unique++] = arr[i];
            }

        }
        double[] result = new double[unique];
        System.arraycopy(temp, 0, result, 0, unique);
        return result;
    }

    public static int[] task6(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void task7(int[] arr) {
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }


    public static int[] task8(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    public static int[] task9(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr;
    }

    public static int[] task10(int[] arr) {
        int[] temp = new int[arr.length];
        int uniqueCount = 0;

        for (int k : arr) {
            boolean isDuplicate = false;

            // Перевіряємо, чи елемент уже є в унікальному масиві
            for (int j = 0; j < uniqueCount; j++) {
                if (k == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Якщо елемент не дублюється, додаємо його в тимчасовий масив
            if (!isDuplicate) {
                temp[uniqueCount++] = k;
            }
        }

        // Створюємо масив результатів потрібного розміру
        int[] result = new int[uniqueCount];
        System.arraycopy(temp, 0, result, 0, uniqueCount);

        return result;
    }

    public static int[] task11(int[] arr) {
        int[] sortArr = new int[arr.length];
        System.arraycopy(arr, 0, sortArr, 0, arr.length);
        Arrays.sort(sortArr);
        return sortArr;
    }

    public static int task12(int[] arr) {
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                secondMax = max;
                max = element;
            } else if (element > secondMax && element != max) {
                secondMax = element;
            }
        }
        return secondMax;

    }

    public static int[] task13(int[] arr) {
        int[] newArr = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                newArr[i] = min;
            } else if (arr[i] == min) {
                newArr[i] = max;
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public static int[] task14(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static int[] task15(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int element : arr) {
            if (element > 0) {
                positive++;
            } else if (element < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        return new int[]{positive, negative, zero};
    }

    public static int task16(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        return Math.max(sum1, sum2);


    }

    public static int[] task17(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    public static int[] task18(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length + 1, arr2.length);
        return newArr;
    }

    public static boolean task19(int[] arr) {
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

}


