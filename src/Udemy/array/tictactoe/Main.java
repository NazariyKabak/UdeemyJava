package Udemy.array.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    public void run() {
        System.out.println("Welcome to Tic Tac Toe");
        char[][] board = createBoard();
        printBoard(board);

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Player 1, enter your move");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("Player 2, enter your move");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);
            int count = checkWin(board);
            if (count == 3) {
                System.out.println("Player 1 wins!");
                break;
            } else if (count == -3) {
                System.out.println("Player 2 wins!");
                break;
            } else if (i == 8) {
                System.out.println("It's a tie!");
            }
        }
        scanner.close();
    }

    public static char [][] createBoard(){
        char [][] board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, '-');
        }
        return board;
    }
    public static void printBoard(char [][] board){
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    public static int[] askUser(char [][] board){
        System.out.print(" - pick a row and column number: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        while (board[row][col] != '-'){
            System.out.println("Invalid move. Try again.");
            row = scanner.nextInt();
            col = scanner.nextInt();
        }
        return new int[]{row, col};
    }

    public static int checkWin(char[][] board){
        int rows = checkRows(board);
        if (Math.abs(rows) == 3){
            return rows;
        }

        int cols=checkCols(board);
        if (Math.abs(cols) == 3){
            return cols;
        }
        int diags =checkDiags(board);
        if (Math.abs(diags) == 3){
            return diags;
        }
        return -1;
    }

    public static int checkRows(char[][] board){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }

            }
            if (Math.abs(count) == 3){
                return count;
            }
        }
        return count;
    }

    public static int checkCols(char[][] board){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if (Math.abs(count) == 3){
                return count;
            }

        }
        return count;
    }

    public static int checkDiags(char[][] board){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X'){
                count++;
            } else if (board[i][i] == 'O'){
                count--;
            } else if (board[2-i][i] == 'X'){
                count++;
            } else if (board[2-i][i] == 'O'){
                count--;
            }
            if (Math.abs(count) == 3){
                return count;
            }
        }
        return count;
    }



}
