package Prac.Exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readFile("example.txt");
    }

    public static void readFile(String path) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path))) {
            int character;
            while ((character = bufferedInputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }


    public static int task2(String num){
        try {
            return Integer.parseInt(num);
        }catch (NumberFormatException e){
            System.out.println("Error! Please enter a number!");
            e.printStackTrace();
            return 0;
        }
    }



}
