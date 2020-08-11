package Lab5.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Mage> mageList = new ArrayList<>(Arrays.asList(
                new Mage("Singha"),
                new Mage("Koa"),
                new Mage("Pee"),
                new Mage("Palm"),
                new Mage("Brown")));

        for (int i = 0; true; i++) {

            mageList = mageList.stream().filter(Mage::isAlive).collect(Collectors.toList());
            if (mageList.size() <=1)
                break;

            Collections.shuffle(mageList);
            System.out.println("\n---------------------------------\n");
            System.out.println("Round : " + (i + 1));

            System.out.println("Survivor : " + mageList.stream().map(Mage::getName).collect(Collectors.joining(", ")));

            Mage a = mageList.stream().findAny().get();
            Mage b = mageList.stream().filter(mage -> mage != a).findAny().get();

            switch ((int) ((Math.random() * 100) % 5)) {
                case 0:
                case 1:
                    a.attack(b);
                    break;
                case 2:
                    a.doubleAttack(b);
                    break;
                case 3:
                    a.heal(b);
                    break;
                case 4:
                    a.heal(a);
                    break;
            }

        }
        Mage winner = mageList.stream().findFirst().get();
        System.out.println("\n==||==||==||==||==||==||==||==||==||==");
        System.out.println("||==||==||==||==||==||==||==||==||==||\n");
        System.out.println("Winner Is "+winner.getName());

        System.out.println(winner);
    }
}
