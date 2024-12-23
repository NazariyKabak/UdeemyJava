package Udemy.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Main main = new Main();
    main.run();
    }
    private void run() {
//        int secret=5;
//        String login="neyzr_11";
//        String password="zamiokulkos11";
//        Scanner scanner = new Scanner(System.in);
//        String loginInput = scanner.nextLine();
//        String passwordInput = scanner.nextLine();

//        int n = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            System.out.println(i);
//        }
//        calc();
//        for (int i=0; i<=18; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz:"+i);
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz:"+i);
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz:"+i);
//            }
//        }

//        while (n!=secret) {
//            System.out.print("Guess Again:");
//            n = scanner.nextInt();
//        }
//        System.out.println("Win!");
//        while (!loginInput.equals(login) && !passwordInput.equals(password)) {
//            System.out.println("Wrong login or password");
//            loginInput = scanner.nextLine();
//            passwordInput = scanner.nextLine();
//        }
//        System.out.println("Welcome!");
//        int num1=roll();
//        int num2=roll();
//
//        while (num1!=num2){
//            System.out.print(num1+" ");
//            System.out.print(num2+" | ");
//            num1=roll();
//            num2=roll();
//
//        }
//        System.out.println(" " +num1+"=="+num2);
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.println("*");
//            }
//        }
        wb5_11();
    }

    public static int roll(){
        double num=Math.random()*6;
        num+=1;
        return (int)num;
    }

    public static void sing(int n) {
        for (int i = 99; i >= n; i--) {
            System.out.println( i+ " bottles of beer on the wall, " +i+ " bottles of beer!");
            System.out.println("take one down, pass it around "+ (i-1)+ ", bottles of beer on the wall!");
        }
    }

    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        int i= scanner.nextInt();
        int n= scanner.nextInt();
        int count=scanner.nextInt();
        for (int c=i;c<=n; c+=count){
            System.out.println(c);
        }
    }
    public void run1(){
        System.out.println(" Let's play Rolling Java. Type anything to start.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Great, here are the rules:\\n");
        System.out.println("If you roll a 6, the game stops.");
        System.out.println(" If you roll a 4, nothing happens.");
        System.out.println("Otherwise, you get 1 point.\\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        int rollNum=roll();
        int point=0;
        while (point!=3){
            rollNum=roll();
            System.out.println(rollNum);
            if (rollNum==6){
                System.out.println("End of game.");
                break;
            }else if (rollNum==4){
                System.out.println("Zero points. Keep rolling.");
            }

            if (rollNum != 4){
                point++;
                System.out.println("Point:"+point);
            }

        }
        if (point==3){
            System.out.println("Winner is "+point);
        }else {
            System.out.println("Tough luck, you lose :(");
        }

    }

    public void wb5_1(){
        for (int i=1;i<=10;i++){
            System.out.println(i+":If Java was easy, they would call it Python!");
        }
    }

    public void wb5_2(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i=0;i<99;i++){
            System.out.println(i+":"+input);
        }
    }

    public void wb5_3(){
        Scanner scanner = new Scanner(System.in);
        int count=scanner.nextInt();
        for (int i=0;i<=count;i++){
            System.out.println(i);
        }
    }

    public void wb5_4(int n){
        for (int i=99;i>=n;i--){
            System.out.println( i+ " bottles of beer on the wall, " +i+ " bottles of beer!");
            System.out.println("take one down, pass it around "+ (i-1)+ ", bottles of beer on the wall!");
        }
    }

    public void wb5_5(){
        Scanner scanner = new Scanner(System.in);
        int count=scanner.nextInt();
        int startCount= scanner.nextInt();
        int finishCount=scanner.nextInt();
        for (int i = startCount; i<=finishCount; i+=count){
            System.out.println(i);
        }
    }

    public void wb5_6(){
        for(int i=0; i<=19;i++){
            if (i%2==0){
                System.out.println(i+" Even");
            }else {
                System.out.println(i+" Odd");
            }
        }
    }

    public void wb5_7(){
        for(int i=0; i<19;i++){
            if (i%3==0){
                System.out.println(i+" Fizz");
            }else if (i%5==0){
                System.out.println(i+" Buzz");
            }else if (i%3==0 && i%5==0){
                System.out.println(i+" FizzBuzz");
            }
        }
    }

    public void wb5_8(){
        int num=generateRandomNumber();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        while (n!=num){
            System.out.println(" No!");
            n=scanner.nextInt();
        }
        System.out.println("You go it!");
    }
    public static int generateRandomNumber() {
        return (int) (Math.random() * 4) + 1;
    }

    public void wb5_9(){
        String userName = "Samantha";
        String password = "pass";
        Scanner scanner = new Scanner(System.in);
        String userNameLog = scanner.nextLine();
        String passwordLog = scanner.nextLine();
        while (!userName.equals(userNameLog) && !password.equals(passwordLog)){
            System.out.println("Incorect!");
            userNameLog=scanner.nextLine();
            passwordLog=scanner.nextLine();
        }
        System.out.println("Welcome!");
    }
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
    public void wb5_10(){
        int dice1=rollDice();
        int dice2=rollDice();
        while (dice1!=dice2){
            System.out.println(dice1);
            System.out.println(dice2);
            dice1=rollDice();
            dice2=rollDice();
        }
        System.out.println(dice1);
        System.out.println(dice2);
    }

    public void wb5_11(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Let's play Rolling Java. Type anything to start.");
        System.out.println("Great, here are the rules:\n");
        System.out.println("If you roll a 6, the game stops.");
        System.out.println("If you roll a 4, nothing happens.");
        System.out.println("Otherwise, you get 1 point.\\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        int points=0;
        int n= rollDice();
        while (points!=3){
            n=roll();
            System.out.println(n);
            if (n==4){
                System.out.println("Zero points.");
            }else if (n==6){
                System.out.println("End of game.");
                break;
            }else {
                points++;
            }
        }
        System.out.println("Pts "+ points);
    }


}
