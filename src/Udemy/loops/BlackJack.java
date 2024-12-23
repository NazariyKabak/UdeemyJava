package Udemy.loops;

import java.util.Scanner;

public class BlackJack {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();
        blackJack.run();
    }
    private void run() {

        System.out.println("Let's play BlackJack. Type anything when you're ready.");
        String input = scanner.nextLine();
        int card1= drawRandomCard();
        int card2= drawRandomCard();
        System.out.println("You get " + randomCard(card1) +" and " + randomCard(card2));
        int totalCards = Math.min(card1,10) + Math.min(card2,10);
        System.out.println("total cards: " + totalCards);
        int dealerCard1= drawRandomCard();
        int dealerCard2= drawRandomCard();
        System.out.println("Dealer get: " + randomCard(dealerCard1) + " invisible card 2" + faceDownCard());
        int dealerTotalCards = Math.min(dealerCard1,10) + Math.min(dealerCard2,10);
        System.out.println("Dealer total cards: ");
        while (true){
            String option = hitOrStay();

            if (option.equals("stay")){
                break;
            }
            int newCard = drawRandomCard();
            totalCards+=Math.min(newCard,10);
            System.out.println("You get a " + randomCard(newCard));
            System.out.println("you total: " + totalCards);

            if (totalCards>21){
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        }
        System.out.println("Dealer turn");
        System.out.println("The dealer card are " + randomCard(dealerCard1) + " and " + randomCard(dealerCard2));
        while (dealerTotalCards<17){
            int newCard = drawRandomCard();
            dealerTotalCards+=Math.min(newCard,10);
            System.out.println("Dealer get: " + randomCard(newCard));
            System.out.println("Dealer total: " + dealerTotalCards);
            if (dealerTotalCards>21){
                System.out.println("Bust! Dealer loses");
                System.exit(0);
            }
        }
        if (totalCards>dealerTotalCards){
            System.out.println("Bust! Player wins");
        }else if (totalCards<dealerTotalCards){
            System.out.println("Bust! Dealer wins");
        }else {
            System.out.println("Tie");
        }
    }

    public static int drawRandomCard(){
        return (int)(Math.random()*13)+1;

    }
    public static String randomCard(int cardNumber){
        switch (cardNumber){
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

    public static String faceDownCard(){
        return "Invisible";
    }
    public static String hitOrStay(){
        System.out.println("Would you like to hit or stay?");
        String response = scanner.nextLine();

        while (!(response.equals("hit") || response.equals("stay"))){
            System.out.println("Please write hit or stay!");
            response = scanner.nextLine();
        }
        return response;
    }
}
