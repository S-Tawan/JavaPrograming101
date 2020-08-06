package Lab3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int n = 0;
        try {
            n = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Pls Enter Numeric");
            main(args);
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(j % 2 == 0 ? "*" : "+");
            }
            System.out.println();
        }
    }
}
