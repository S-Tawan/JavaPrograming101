package Lab4.Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(Arrays.asList(new Car("Singha"), new Car("Pee"), new Car("Koa")));

        for (int i = 0; i < 10; i++) {
            System.out.println("\n---------------------------------\n");
            System.out.println("Round : "+(i+1));
            for (Car car : cars) {
                switch ((int) ((Math.random() * 100 + car.getVelocity() + car.getBrand().length()) % 5)) {
                    case 0:
                    case 1:
                    case 2:
                        car.speedUp();
                        break;
                    case 3:
                        car.speedDown();
                        break;
                }
                car.calculate();
            }
        }

        Car winner  = cars.stream().max(Comparator.comparingInt(Car::getPosition)).get();
        System.out.println("\n==||==||==||==||==||==||==||==||==||==");
        System.out.println("||==||==||==||==||==||==||==||==||==||\n");
        System.out.println("Winner Is "+winner.getBrand());

        System.out.println(winner);
    }
}
