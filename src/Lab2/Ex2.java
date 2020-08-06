package Lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            double value = Math.random() * 1000;
            System.out.printf("Input " + (i + 1) + " : %.2f \n", value);
//            System.out.print("Input " + (i + 1) + " : " );
//            double value = Double.parseDouble(scanner.nextLine());

            doubles.add(value);
            sum += value;
        }
        System.out.println(String.format("%.2f is maximum, %.2f is minimum, average is %.2f", Collections.max(doubles), Collections.min(doubles), sum / doubles.size()));

    }
}
