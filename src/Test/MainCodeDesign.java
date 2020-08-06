package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Mint {
    private int mintValue;

    public Mint() {
        this.mintValue = 0;
    }

    public Mint(int mintValue) {
        this.mintValue = mintValue;
    }

    public int getMintValue() {
        return mintValue;
    }

    public void setMintValue(int mintValue) {
        this.mintValue = mintValue;
    }
}

class MintClassic extends Mint {

    public MintClassic() {
        super();
    }

    public MintClassic(int mintValue) {
        super(mintValue);
    }
}

class MintSugarFree extends Mint {

    public MintSugarFree() {
        super();
    }

    public MintSugarFree(int mintValue) {
        super(mintValue);
    }
}

class MintCinnamon extends Mint {

    public MintCinnamon() {
        super();
    }

    public MintCinnamon(int mintValue) {
        super(mintValue);
    }
}

class MintContainer {
    private MintClassic mintClassic;
    private MintSugarFree mintSugarrFree;
    private MintCinnamon mintCinnamon;
    private int truckCapacity;

    public MintContainer() {
        mintClassic = new MintClassic(4);
        mintSugarrFree = new MintSugarFree();
        mintCinnamon = new MintCinnamon();

        truckCapacity = 4;
    }

    public int getTruckCapacity() {
        return truckCapacity;
    }
}

class Player {
    private int score;
    private MintContainer mintContainer;
    private int actionPoint;

    public Player() {
        mintContainer = new MintContainer();
        score = 0;
        actionPoint = 2;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public MintContainer getMintContainer() {
        return mintContainer;
    }
}


class LinkRoutes {
    private String naame;
    private LinkRoutes top, bottom, left, right;

    public String[] getActions() {
        return null;
    }
}

class MintopiaCity extends LinkRoutes {

    @Override
    public String[] getActions() {
        String[] actions = {"loadTruck", "convertToGreen", "convertToRed"};
        return actions;
    }

    public void loadTruck(int value, MintContainer mintContainer) {

    }

    public void convertToGreen(MintContainer mintContainer) {

    }

    public void convertToRed(MintContainer mintContainer) {

    }
}

class SpearrmintSprings extends LinkRoutes {

    @Override
    public String[] getActions() {
        String[] actions = {"sendGreenOrder"};
        return actions;
    }

    public void getOrder() {

    }

    public void sendGreenOrder(MintContainer mintContainer) {

    }
}

class PeppermintPines extends LinkRoutes {

    @Override
    public String[] getActions() {
        String[] actions = {"sendBlueOrder"};
        return actions;
    }

    public void getOrder() {

    }

    public void sendBlueOrder(MintContainer mintContainer) {

    }
}

class FreshnessFall extends LinkRoutes {

    @Override
    public String[] getActions() {
        String[] actions = {"sendOrangeOrder"};
        return actions;
    }

    public void getOrder() {

    }

    public void sendOrangeOrder(MintContainer mintContainer) {

    }
}

class CinnamonCenter extends LinkRoutes {

    @Override
    public String[] getActions() {
        String[] actions = {"sendRedOrder"};
        return actions;
    }

    public void getOrder() {

    }

    public void sendRedOrder(MintContainer mintContainer) {

    }
}

class WareHouse extends LinkRoutes {

    @Override
    public String[] getActions() {
        String[] actions = {"loadTruck", "convertToGreen"};
        return actions;
    }

    public void loadTruck(int value, MintContainer mintContainer) {

    }

    public void convertToGreen(MintContainer mintContainer) {

    }
}

class Terrain {
    LinkRoutes[] linkRRoutes;
    private final int routeAmout = 21;

    public Terrain() {
        createLinkRoute();
        setupLinkRoute();
    }

    private void createLinkRoute() {
        linkRRoutes = new LinkRoutes[routeAmout];
        setupLinkRoute();
        System.out.println("Create Route success.");
    }

    protected void setupLinkRoute() {

    }
}

class GameEnvironment {
    private int numberPlayers;
    private Player players[];
    private Terrain terrain;

    Scanner s = new Scanner(System.in);

    private void createPlayers() {
        this.players = new Player[this.numberPlayers];

        for (int i = 0; i < this.numberPlayers; i++) {
            players[i] = new Player();
        }

        System.out.println("Create players success.");
    }

    private void createTerrain() {
        this.terrain = new Terrain();
        System.out.println("Crerate terrain success.");
    }

    protected void setupEnvironmentGame() {
        System.out.print("Enter number of players[2-5]: ");
        this.numberPlayers = s.nextInt();
        createPlayers();
        createTerrain();
    }
}

enum Mints {
    CLASSIC, SUGAR_FREE, CINNAMON
}

public class MainCodeDesign {
    public static void main(String[] args) {
//        GameEnvironment game = new GameEnvironment();
//        game.setupEnvironmentGame();
//

        Map<String, Integer> mints = new HashMap<>();
        mints.put(Mints.CLASSIC.toString(), 4);
        mints.put(Mints.CLASSIC.toString(), mints.getOrDefault("Classic", 0) + 2);
        mints.put(Mints.CINNAMON.toString(), 2);
        mints.put(Mints.SUGAR_FREE.toString(), 3);
        System.out.println(mints.values().stream().reduce(0, Integer::sum));

        System.out.println(mints);


    }
}
