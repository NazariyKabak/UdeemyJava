package Udemy.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run3();
    }
    public void run1() {
        System.out.println(areaSquare(2));
        System.out.println(areaRectangle(5,3));

    }
    public static void printBard(){
        System.out.println("I will not copy and paste code.");
        System.out.println("I will use Camel Case when writing class names.");
        System.out.println("I will use lower Camel Case when writing function names.");
        System.out.println("I will use lower Camel Case when writing variables names.");

    }

    public static double area(double width, double height){
        return width*height;
    }

    public static void tipTheWaiter(double sum){
        sum *= (double) 15 /100;
        System.out.println(sum);
    }

    public static String explainArea(String lang){
        switch(lang){
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish ":
                return "area es igual a largo * ancho";
            default:return "Lang is not available";
        }

    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void printTemperature(double fahrenheit){
        System.out.println(fahrenheit);
        System.out.println(fahrenheitToCelsius(fahrenheit));
    }



    public static void draw(int choice){
        switch(choice){
            case 1:
                System.out.println("a butterfly");
                break;
            case 2:
                System.out.println("elephant");
                break;
            case 3:
                System.out.println("bear");
                break;
            case 4:
                System.out.println("Snake");
                break;
        }
    }
    public void run2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant  ");
        System.out.println("Write 3 for bear      ");
        System.out.println("Write 4 for snake     ");

        int choice = scanner.nextInt();
        draw(choice);
        scanner.close();

    }


    public static double areaSquare(double sid){
        if (sid<0){
            System.out.println("Invalid side.");
            return 0;
        }
        return Math.pow(sid,2);
    }

    public static double areaRectangle(double width, double height){
        if (width<0&&height<0){
            System.out.println("Invalid side.");
            return 0;
        }
        double area=width*height;
        return area;
    }
    public static double areaTriangle(double base, double height){
        if (base<0&&height<0){
            System.out.println("Invalid side.");
            return 0;
        }
        double area=base*height/2;
        return area;
    }

    public static double areaCircle(double radius){
        if (radius<=0){
            System.out.println("Invalid side.");
            return 0;
        }
        return radius*3.14;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three num between 1 and 6:");
        int roll1=randNums();
        int roll2=randNums();
        int roll3=randNums();
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if (areLessThan1(num1,num2,num3)|| areHigherThan6(num1,num2,num3)){
            System.out.println("Invalid number.");
            System.exit(0);
        }
        int sumOfNumbers = num1+num2+num3;
        int sumOfDiceRolls=roll1+roll2+roll3;
        System.out.println("Your sum: " + sumOfNumbers+ " PC sum: " + sumOfDiceRolls)   ;
        if (userWon(sumOfNumbers,sumOfDiceRolls)){
            System.out.println("Congratulations, you won!");
        }else {
            System.out.println("Sorry, you lost!");
        }

        scanner.close();
       // System.out.println(randNums());
        //System.out.println(randNums());
        //System.out.println(randNums());
    }

    public static int randNums(){
        double v = Math.random() *6;
        v+=1;
        return (int)v;

    }

    public static boolean areLessThan1(int num1, int num2,int num3){
        return (num1<1||num2<1||num3<1);
    }

    public static boolean areHigherThan6(int num1, int num2,int num3){
        return (num1>6||num2>6||num3>6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRole){
        return (sumNumbers>sumDiceRole && (sumNumbers-sumDiceRole)<5);
    }


    //game Rock paper scissors

    public void run3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");
        System.out.println("Enter yes or no");
        String response = scanner.nextLine();
        if (response.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scanner.nextLine();
            String pcChoice=computerChoice();
            String finalResult=wins(userChoice,pcChoice);
            result(userChoice,pcChoice,finalResult);

        }else {
            System.out.println("Darn, some other time...!");
        }
    }


   public static String computerChoice(){
       int randomNum = (int)(Math.random() *3);
        if (randomNum==0){
            return "rock";
        }else if (randomNum==1){
            return "paper";
        }else if (randomNum==2){
            return "scissors";
        }else {
            return "error";
        }
   }
   public static String wins(String userChoice, String computerChoice){
        if (userChoice.equals("rock") && computerChoice.equals("scissors")
                ||userChoice.equals("scissors") && computerChoice.equals("paper")
                ||userChoice.equals("paper") && computerChoice.equals("rock")){
            return "User wins";
        } else if (userChoice.equals(computerChoice)) {
            return "Draw";

        } else {
            return "PC wins";
        }
   }
   public static void result(String yourChoice, String computerChoice, String result){
       System.out.println("Your choice: " + yourChoice);
       System.out.println("ComputerChoice: " + computerChoice);
       System.out.println(result);
   }
}

