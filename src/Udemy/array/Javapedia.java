package Udemy.array;

import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int n = scanner.nextInt();
        String[] []historicalFigures = new String[n][3];
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Enter the name of the historical figure:");
            historicalFigures[i][0] = scanner.nextLine();
            System.out.println("Enter the year of birth of the historical figure:");
            historicalFigures[i][1] = scanner.nextLine();
            System.out.println("Enter the year of death of the historical figure:");
            historicalFigures[i][2] = scanner.nextLine();
        }
        print(historicalFigures);
    }

    public static void print(String[][] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }

        }
    }


}
