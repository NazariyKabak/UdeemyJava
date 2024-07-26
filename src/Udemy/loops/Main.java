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
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("*");
            }
        }
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



}
