package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        long input = 0;
        try {
            input = Long.parseLong(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Please Enter Numeric");
            main(args);
        }
        if (input < 2) {
            System.out.println("Please Enter more than or equal 2");
            main(args);
        }
        if (isPrimeNumber(input)) {
            List<Long> primeNumbers = new ArrayList<>();
            for (long i = 2; i < input; i++) {
                if (isPrimeNumber(i))
                    primeNumbers.add(i);
            }
            primeNumbers.add(input);
            for (int i = 1; i <= primeNumbers.size(); i++) {
                System.out.printf(" %6d ", primeNumbers.get(i - 1));
                if (i % 5 == 0)
                    System.out.println();
            }
        } else {
            System.out.println(input + " is not prime number");
        }
        System.out.println("\n---------------------------------");
        main(args);
    }

    private static boolean isPrimeNumber(long i) {
        for (int j = 2; j < i; j++)
            if (i % j == 0) return false;
        return true;
    }
}
