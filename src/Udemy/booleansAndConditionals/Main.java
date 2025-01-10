package Udemy.booleansAndConditionals;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        sortNums();
    }

    private void run1() {
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
    }

    public void run2() {
        double wallet=100;
        System.out.println("Can you buy me this?");
        if(wallet>=100){
            System.out.println("Sure!");
            wallet-=90;
        }else {
            System.out.println("I have 10$");
        }

        System.out.println("Can you buy me this?");
        if(wallet>=100){
            System.out.println("Sure!");
        }else {
            System.out.println("I have 10$");
        }
    }

    public void run3() {
        int gryffindor=400;
        int ravenclaw=200;
        int margin=gryffindor-ravenclaw;
        if (margin>=300){
            System.out.println("Wins Gryffindor");
        }else if (margin>=0){
            System.out.println("Second Gryffindor");
        }else if (margin>=-100){
            System.out.println("Third Gryffindor");
        }else {
            System.out.println("Fourth Gryffindor");
        }
    }

    public void run4(){
        int temp=6;
        String forecast;
        if (temp<=-1){
            forecast="Very Cold!";
            System.out.println(forecast);
        } else if (temp<=10) {
            forecast="Cold";
            System.out.println(forecast);
        }else {
            forecast="Hot";
            System.out.println(forecast);
        }
    }

    public void run5(){
        int day=6;
        boolean holiday = true;
        if (day<6 && holiday) {
            System.out.println("Woohoo, no work");
        } else if (day>=6 &&holiday==false) {
            System.out.println("Holiday");
        }else {
            System.out.println("Wake up 7:00");
        }
    }

    public void run6(){
        String day="Wednesday";
        System.out.println("Hey, are you free on " + day + "? \n");
        System.out.println("Hmm, let me check my calendar.");

        switch (day) {
            case "Monday":
                System.out.println("Sorry, I have to stay at work late");
                break;
            case "Tuesday":
                System.out.println("It looks like I have meetings all day.");
                break;
            case "Wednesday":
                System.out.println("I have a dentist appointment today. ");
                break;
            case "Thursday":
                System.out.println("Sorry, is date night!");
                break;
            case "Friday":
                System.out.println("I`m free!");
                break;
            case "Saturday":
                System.out.println("I`m free!");
                break;
            case "Sunday":
                System.out.println("I`m free!");
                break;
        }
    }

    public void run7(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String option=scan.nextLine();
        switch (option) {
            case "yes":
                System.out.println("\nGreat! In one line" +
                        "\nHow much money do you have in your savings?" +
                        "\nAnd, how much do you owe in credit card debt?");
                double savings=scan.nextDouble();
                double debtCredit=scan.nextDouble();
                System.out.println("How many years have you worked for?");
                int years=scan.nextInt();
                System.out.println("What is your name");
                scan.nextLine();
                String name=scan.nextLine();
                if (savings>=10000&&debtCredit<5000&& years>2){
                System.out.println("Congratulations "+name+", you have been approved");
                }else {
                System.out.println("Sorry, you have not been approved");
                }
                break;
            case "no":
                System.out.println("\nOK. Have a nice day!");
                break;

        }
//        if (option.equals("yes")) {
//            System.out.println("\nGreat! In one line" +
//                    "\nHow much money do you have in your savings?" +
//                    "\nAnd, how much do you owe in credit card debt?");
//            double savings=scan.nextDouble();
//            double debtCredit=scan.nextDouble();
//            System.out.println("How many years have you worked for?");
//            int years=scan.nextInt();
//            System.out.println("What is your name");
//            scan.nextLine();
//            String name=scan.nextLine();
//            if (savings>=10000&&debtCredit<5000&& years>2){
//                System.out.println("Congratulations "+name+", you have been approved");
//            }else {
//                System.out.println("Sorry, you have not been approved");
//            }
//        }else {
//            System.out.println("\nOK. Have a nice day!");
//        }




    }

    public void run8(){
        System.out.println("Witch country geld the 2016 Summer Olympics?");
        Scanner scan=new Scanner(System.in);
        String firstAnswer=scan.nextLine();
        System.out.println("Which planet is the hottest?");
        String secondAnswer=scan.nextLine();
        System.out.println("What is the rarest blood type?");
        String thriedAnswer=scan.nextLine();
        System.out.println("Which one if these characters is friends with Harry Potter?");
        String fourAnswer=scan.nextLine();

        int point=0;
        if (firstAnswer.equals("c")){
            point+=5;
        }
        if (secondAnswer.equals("a")) {
            point+=5;
        }
        if (thriedAnswer.equals("d")) {
            point+=5;
        }
        if (fourAnswer.equals("a")|| fourAnswer.equals("b")) {
            point+=5;
        }
        System.out.println(point);

        if (point>=15){
            System.out.println("Wow, you know your stuff");
        } else if (point<15 && point>=5) {
            System.out.println("Not Bad");
        }else System.out.println("Better luck next time");
//        switch (country){
//
//            case "a":
//                System.out.println("China.False");
//                break;
//            case "b":
//                System.out.println("Ireland.False");
//                break;
//            case "c":
//                System.out.println("Brazil.True!");
//                point+=5;
//                System.out.println(point);
//                break;
//            case "d":
//                System.out.println("Italy.False");
//                break;
//        }
//
//
//
//        switch (planet){
//            case "a":
//                System.out.println("Venus.False");
//                point+=5;
//                System.out.println(point);
//                break;
//            case "b":
//                System.out.println("Saturn.False");
//                break;
//            case "c":
//                System.out.println("Mercury.True!");
//
//                break;
//            case "d":
//                System.out.println("Mars.False");
//                break;
//        }

    }


    public void wb3_2(){
        double wallet = 100;

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).


        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if (toyCar<wallet) {
            System.out.println("Sure");
            wallet -= toyCar;
        }else {
            System.out.println("No!");
        }


        //if you have enough money
        //       print: Sure!
        //       pay for the toy car

        //else:  Sorry, I only have <wallet> left.
        System.out.println(wallet);
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if (nike<=wallet) {
            System.out.println("Sure");
            wallet -= nike;
        }else {
            System.out.println("No!");
        }
    }

    public void wb3_3(){
        int gryffindor = 400;
        int ravenclaw = 200;
        int div = gryffindor - ravenclaw;
        if (div>=300){
            System.out.println("gryffindor win!");
        } else if (div>=0) {
            System.out.println("gryffindor 2 place!");
        } else if (div>=-100) {
            System.out.println("gryffindor 3 place!");
        }else {
            System.out.println("gryffindor 4 place!");
        }
    }

    public void wb3_4(){
        int temp = 25;
        String forecast;
        if (temp<=-1){
            forecast = "Freezzing!";
        } else if (temp<=10) {
            forecast = "Forecast is Chilly! Wear a coat!";
        }else {
            forecast = "It`s warm.";
        }
        System.out.println(forecast);
    }

    public void wb3_5(){
        int day =6;
        boolean holiday = false;
        if (holiday){
            System.out.println("Holiday!");
        } else if (day==6 || day==7) {
            System.out.println("Weekend!");
        }else {
            System.out.println("Workday!");
        }
    }

    public void wb3_6(){
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Sorry, I have to stay at work late.");
                break;
            case "Tuesday":
                System.out.println("It looks like I have meetings all day.");
                break;
            case "Wednesday":
                System.out.println("I have a dentist appointment. Some other time!");
                break;
            case "Thursday":
                System.out.println("Sorry, thursday is date night!");
                break;
            case "Friday":
                System.out.println("I'm free!!");
                break;
            case "Saturday":
                System.out.println("I'm free!!");
                break;
            case "Sunday":
                System.out.println("I'm free!!");
                break;

            default:
                System.out.println("That's not a day.");

        }
    }

    public void wb3_7(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Ви тут, щоб отримати іпотеку? (так чи ні)");
        String firstAnswer=scan.nextLine();
        if (firstAnswer.equals("yes")){
            System.out.println("\nЧудово!" +"\nСкільки у вас заощаджень?" + "\nСкільки ви заборгували за кредитною карткою?");
            double savings=scan.nextDouble();
            double dept = scan.nextDouble();
            System.out.println("\nСкільки років Ви працюєте?");
            int year=scan.nextInt();
            System.out.println("Як вас звати?");
            scan.nextLine();
            String name = scan.nextLine();
            if (savings>=10000 && dept<5000 && year>2 ){
                System.out.println("Вітаємо " +name+", вас схвалено!");
            }else {
                System.out.println("Вибачте, ви не маєте права на іпотеку");
            }
        }else {
            System.out.println("\nОК. Гарного дня!");
        }

        scan.close();
    }

    public void triviaQuiz(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which country held the 2016 Summer Olympics?");
        String firstAnswer=scan.nextLine();
        System.out.println("Which planet is the hottest?");
        String secondAnswer=scan.nextLine();
        System.out.println("What is the rarest blood type?");
        String thirdAnswer=scan.nextLine();
        System.out.println("Which one of these characters is friends with Harry Potter?");
        String fourthAnswer=scan.nextLine();

        int score =0;
        if (firstAnswer.equals("c")){
            score+=5;
        }
        if(secondAnswer.equals("a")){
            score+=5;
        }
        if(thirdAnswer.equals("d")){
            score+=5;
        }
        if(fourthAnswer.equals("a") || fourthAnswer.equals("b")){
            score+=5;
        }
        System.out.println(score);
    }


    public static void checkParityNum() {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static String ageCategoryDefinition(){
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        return age < 18? "Child": age>=13 && age <=19? "Teenager": age>=20 && age<=69? "Adult": "Senior";
    }

    public static void checkRangeNum(){
        System.out.println("Enter a number: ");
        if (scanner.hasNextDouble()){
            double num = scanner.nextDouble();
            if (num>=10 && num<=50){
                System.out.println("The number is in the range");
            }else {
                System.out.println("The number is not in the range");
            }
        }
    }


    public static double calcMaxThreeNum(){
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double max = num1;
        if (num2>max){
            max = num2;
        }else if (num3>max){
            max = num3;
        }
        return max;
    }

    public static void definitionLeapYear(){
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("The year is a leap year");
        }else {
            System.out.println("The year is not a leap year");
        }

    }

    public static void calc(){
        System.out.println("Enter a action:");
        char action = scanner.next().charAt(0);
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = 0;
        switch (action){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2!=0){
                    result = num1 / num2;
                }else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid action");
        }
        System.out.println("The result is: " + result);
    }

    public static void season(){
        System.out.println("Enter a number month:");
        int month = scanner.nextInt();
        String season = "";
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println("The season is: " + season);
    }

    public static void estimate(){
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        switch (num){
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Poor");
                break;
            case 4:
                System.out.println("Satisfactory");
                break;
            case 5:
                System.out.println("Good");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public static void dayWeek(){
        System.out.println("Enter a number day of the week:");
        int day = scanner.nextInt();
        String dayWeek = "";
        switch (day){
            case 1:
                dayWeek = "Monday";
                break;
            case 2:
                dayWeek = "Tuesday";
                break;
            case 3:
                dayWeek = "Wednesday";
                break;
            case 4:
                dayWeek = "Thursday";
                break;
            case 5:
                dayWeek = "Friday";
                break;
            case 6:
                dayWeek = "Saturday";
                break;
            case 7:
                dayWeek = "Sunday";
                break;
            default:
                dayWeek = "Invalid day";
        }
        System.out.println("The day of the week is: " + dayWeek);
    }

    public static void currencies(){
        System.out.println("Enter a currencies: ");
        scanner.nextLine();
        String currency = scanner.nextLine();
        switch (currency){
            case "USD":
                System.out.println("United States Dollar");
                break;
            case "EUR":
                System.out.println("Euro");
                break;
            case "GBP":
                System.out.println("British Pound Sterling");
                break;
            case "INR":
                System.out.println("Indian Rupee");
                break;
            case "AUD":
                System.out.println("Australian Dollar");
                break;
            case "CAD":
                System.out.println("Canadian Dollar");
                break;
            case "SGD":
                System.out.println("Singapore Dollar");
                break;
            case "CHF":
                System.out.println("Swiss Franc");
                break;
            case "MYR":
                System.out.println("Malaysian Ringgit");
                break;
            case "JPY":
                System.out.println("Japanese Yen");
                break;
            default:
                System.out.println("Invalid currency");
        }

    }

    public static void checkNumPrimeness(){
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        if (num/1==num && num/num==1){
            System.out.println("The number is prime");}
        else {
            System.out.println("The number is not prime");
        }
    }

    public static void sortNums(){
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1>num2 && num1>num3 && num2>num3){
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1>num2 && num1>num3 && num3>num2){
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2>num1 && num2>num3 && num1>num3){
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2>num1 && num2>num3 && num3>num1){
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3>num1 && num3>num2 && num1>num2){
            System.out.println(num3 + " " + num1 + " " + num2);
        } else {
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }

    public static double tempConvert(){
        System.out.println("Enter a temperature:");
        double temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter a scale (C or F):");
        char scale = scanner.nextLine().charAt(0);
        double result = 0;
        if (scale == 'C'){
            result = temp * 9/5 + 32;
        }else if (scale == 'F'){
            result = (temp - 32) * 5/9;
        }
        return result;
    }

}
