package Lab5.Ex2;

import Lab5.Ex1.Mage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Car> cars = new ArrayList<>(
                Arrays.asList(
                        new Car("Singha"),
                        new Car("Koa"),
                        new Car("Pee"),
                        new Car("Palm"),
                        new Car("Brown")));

        for (int i = 0; i < 10; i++) {
            System.out.println("\n---------------------------------\n");
            System.out.println("Round : " + (i + 1));
            for (Car car : cars) {
                if (random.nextBoolean()) {
                    car.changeGear();
                }
                if (random.nextBoolean()) {
                    car.speedUp();
                } else {
                    car.speedDown();
                }
                car.calculate();
            }
        }

        Car winner = cars.stream().max(Comparator.comparingInt(car -> Math.abs(car.getPosition()))).get();
        System.out.println("\n==||==||==||==||==||==||==||==||==||==");
        System.out.println("||==||==||==||==||==||==||==||==||==||\n");
        System.out.println("Winner Is " + winner.getBrand());

        System.out.println(winner);
    }
}
