package Epam.task1;

public class Main {
    public static void main(String[] args) {

    }

    public static double calculate(char actions, double a, double b) {
        double result = 0;
        switch (actions) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid action");
        }
        return result;
    }

}
