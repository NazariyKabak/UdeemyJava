package Udemy.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.run16();
    }
    private void run() {
        String [] students ={"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]+", you will take seat " +i);
        }
    }

    private void run2() {
        String [] fruits ={"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
    }

    private void run3() {
        String [] fruits ={"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
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
        int seat=0;
        int [] scores={randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),
                randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};
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
    public static int randomNumber(){
        double v = Math.random() *50000;
        return (int)v;
    }

    public void run5(){
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins=0;
        int losses=0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins++;
            }else {
                losses++;
            }
        }
        System.out.println(wins);
        System.out.println(losses);
    }

    public void run6(){
        String[]apples={"Gala", "Granny Smith", "Macintosh"};
        double [] price={1.99, 1.49, 1.29};
        for (int i = 0; i < 3; i++) {
            System.out.println(apples[i] +" "+ price[i]);
        }
    }

    public void run7(){
        String[] menu ={"Espresso", "Iced coffee", "Macchiato"};
        menu[2]="Late";
        System.out.println(Arrays.toString(menu));
        String [] newMenu= new String[5];
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3]="Tea";
        newMenu[4]="Ice Latte";
        System.out.println(Arrays.toString(newMenu));
    }

    public void run8(){
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax= new double[price.length];
        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i];
            afterTax[i] = price[i] +price[i]*0.13;
            System.out.println(afterTax[i]);
        }
    }

    public void run9(){
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        scanner.nextLine();
        String [] toppings= new String[size];
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i+". ");
            toppings[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(toppings));
    }

    public void run10(){
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int [] ticket2= Arrays.copyOf(ticket, ticket.length);
        ticket2[2]=54;
        printTicket(ticket);
        printTicket(ticket2);

    }
    public static void printTicket(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static double[] celciusToFahrenheit(double[] celcius){
        double [] farenheit= new double[celcius.length];
        for (int i = 0; i < farenheit.length; i++) {
            farenheit[i]=celcius[i];
            farenheit[i]=(celcius[i]/5*9)+32;
        }
        return farenheit;

    }
    public static void printTemperature(double[] arr, String type){
        for (double element: arr){
            System.out.println(type+":"+element);
        }
    }

    public void run11(){
        double [] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double [] farenheit=celciusToFahrenheit(celsius);
        printTemperature(celsius,"Celcius");
        printTemperature(farenheit,"Farenheit");
    }

    public void run12(){
        int [][]nums = new int[3][4];
        nums[0][0]=2;
        nums[0][1]=1;
        nums[0][2]=323;
        nums[0][3]=4;
        nums[1][3]=10;
        nums[2][2]=134;
        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));
    }
    public void run13(){
        double[][] nums = new double[3][5];
        nums[0][0]=12.99;
        nums[0][1]=8.99;
        nums[0][2]=9.99;
        nums[0][3]=10.49;
        nums[0][4]=11.99;
        nums[1][0]=0.99;
        nums[1][1]=1.99;
        nums[1][2]=2.49;
        nums[1][3]=1.49;
        nums[1][4]=2.99;
        nums[2][0]=8.99;
        nums[2][1]=7.99;
        nums[2][2]=9.49;
        nums[2][3]=9.99;
        nums[2][4]=10.99;


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                switch (i){
                    case 0:System.out.print("Baking: "); break;
                    case 1:System.out.print("Beverage: "); break;
                    case 2:System.out.print("Cereals: "); break;
                }
                System.out.println(nums[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static int randomNumber2() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }
    public static void print2DArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    public void run14(){
        int[][] array = {
                {48, 56, 56, 76, 0, 81, 51, 81, 99, 70},
                {38, 52, 73, 6, 10, 56, 1, 71, 47, 9},
                {85, 35, 47, 98, 91, 25, 69, 52, 2, 93}
        };
        print2DArray(array);
        int [][] arr = new int[100][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNumber();
            }
        }
        print2DArray(arr);
    }

    public void run15(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        String [][] database= new String[4][3];
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database[i].length; j++) {
                database[i][j] = scanner.nextLine();
            }
        }
//        print2DArrayDatabase(database);

        System.out.println("Who do you inf on");
        String name= scanner.nextLine();
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
    public static void print2DArrayDatabase(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public void run16(){
        char[] []ticTac={
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}
        };
        printBoard(ticTac);
        for (int i=0;i<9;i++){
            if (i%2==0){
                System.out.println("Turn: X");
                int []spot=askUser(ticTac);
                ticTac[spot[0]][spot[1]]='X';
            }else {
                System.out.println("Turn: O");
                int []spot=askUser(ticTac);
                ticTac[spot[0]][spot[1]]='O';
            }
            printBoard(ticTac);
            int count =checkWin(ticTac);
            if (count==3){
                System.out.println("X wins!");
                break;
            } else if (count==-3) {
                System.out.println("O wins");
                break;
            }
        }


    }

    public static void printBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[] askUser(char[][] board){
        System.out.print(" pick the row and column:");
        int row = scanner.nextInt();
        int element=scanner.nextInt();
        while (board[row][element]=='X'||board[row][element]=='O'){
            System.out.print("Spot taken, try again!: ");
            row = scanner.nextInt();
            element=scanner.nextInt();
        }
        return new int[]{row,element};
    }

    public static int checkWin(char[][] board){
        int rows=checkRows(board);
        if (Math.abs(rows)==3){
            return rows;
        }
        int columns=checkColumns(board);
        if (Math.abs(columns)==3){
            return columns;
        }

        int left=checkLeft(board);
        if (Math.abs(left)==3){
            return left;
        }
        int right=checkRight(board);
        if (Math.abs(right)==3){
            return right;
        }
        return -1;
    }
    public static int checkRows(char[][] board){
        int count=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]=='X'){
                    count++;
                } else if (board[i][j]=='O') {
                    count--;
                    
                }
            }
            if (count==3||count==-3){
                return count;
            }else {
                count=0;
            }
        }
        return count;
    }
    public static int checkColumns(char[][] board){
        int count=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i]=='X'){
                    count++;
                } else if (board[j][i]=='O') {
                    count--;

                }
            }
            if (count==3||count==-3){
                return count;
            }else {
                count=0;
            }
        }
        return count;
    }

    public static int checkLeft(char[][] board){
        int count=0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i]=='X'){
                count++;
            }else if (board[i][i]=='O'){
                count--;
            }
        }
        return count;
    }
    public static int checkRight(char[][] board){
        int count=0;
        for (int i = 0; i < board.length; i++) {
            if (board[2-i][i]=='X'){
                count++;
            }else if (board[2-i][i]=='O'){
                count--;
            }
        }
        return count;
    }
}
