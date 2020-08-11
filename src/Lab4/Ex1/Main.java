package Lab4.Ex1;

public class Main {
    public static void main(String[] args) {
        Knight singha = new Knight("Singha");
        Knight pee = new Knight("PeePee");
        singha.setDef(20);
        pee.setDef(10);
        System.out.println(singha);
        System.out.println(pee);

        singha.attack(pee);
        pee.doubleAttack(singha);
        singha.doubleAttack(pee);
        pee.extraHp();
        singha.attack(pee);
        pee.doubleAttack(singha);
        singha.doubleAttack(pee);
        singha.doubleAttack(pee);
        pee.attack(singha);
        pee.attack(singha);
        pee.attack(singha);
        pee.attack(singha);
        pee.attack(singha);
        pee.attack(singha);
        pee.attack(singha);
        pee.attack(singha);
        pee.attack(singha);

    }
}
