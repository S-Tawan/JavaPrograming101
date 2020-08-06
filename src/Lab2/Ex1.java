package Lab2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0;
        String operator;
        double results = 0;
        System.out.print("Input 1 : ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("Operator : ");
        operator = scanner.nextLine();
        System.out.print("Input 2 : ");
        b = Double.parseDouble(scanner.nextLine());

        switch (operator) {
            case "+":
                results = a + b;
                break;
            case "-":
                results = a - b;
                break;
            case "*":
                results = a * b;
                break;
            case "/":
                results = a / b;
                break;
            default:
                System.out.println("Operator is wrong");
        }

        System.out.println("Results : " +results);


        System.out.println("\n---------------------------------------------------\n");

        main(args);
    }
}
