package Udemy.loops;

import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Pokerito pokerito = new Pokerito();
        pokerito.run();
    }
    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        String input = scanner.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println(" - There are two players, you and the computer.");
        System.out.println(" - The dealer will give each player one card.");
        System.out.println(" - Then, the dealer will draw five cards (the river)");
        System.out.println(" - The player with the most river matches wins!");
        System.out.println(" - If the matches are equal, everyone's a winner!");
        System.out.println(" - Ready? Type anything if you are.");
        String response = scanner.nextLine();

        String myCard = randomCard();
        System.out.println("Here's your card: "+myCard);

        String pcCard = randomCard();
        System.out.println("Here's the computer's card: "+pcCard);

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        String response2= scanner.nextLine();
        int countMy=0;
        int countPc=0;
        for(int i = 1; i <=5; i++){
            scanner.nextLine();
            String drawCard = randomCard();
            System.out.println(i+":"+drawCard);
            if (myCard.equals(drawCard)){
                countMy++;
                System.out.println("i`m:"+countMy);
            }else if (pcCard.equals(drawCard)) {
                countPc++;
                System.out.println("PC:"+countPc);
            }else if (myCard.equals(pcCard)) {
                System.out.println("Tie!");
                break;
            }
        }
        if (countMy==countPc){
            System.out.println("It's a tie!");
        }else if (countMy>countPc){
            System.out.println("You`r win!");
        }else {
            System.out.println("PC win!");
        }




    }

    public static String randomCard(){
        int num=(int)(Math.random()*13)+1;
        switch (num){
            case 1:
                return "Ace";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "J";
            case 12:
                return "D";
            case 13:
                return "K";
            default:
                return "Invalid card";
        }
    }
}
