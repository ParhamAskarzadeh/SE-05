import calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.println("Welcome");

        System.out.println("please Enter your first number");
        int number1 = scanner.nextInt();

        System.out.println("please Enter your second number");
        int number2 = scanner.nextInt();

        double result = 0;
        try {
            result = calculator.calculate(number1, number2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("your Result is : " + result);
    }

}
