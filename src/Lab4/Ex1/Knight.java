package Lab4.Ex1;

import java.util.function.Supplier;

public class Knight {
    private String name;
    private double hp;
    private double mp;
    private double atk;
    private double def;
    private boolean alive = true;

    public Knight(String name, double hp, double mp, double atk, double def) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
    }

    public Knight(String name) {
        this.name = name;
        this.hp = 100;
        this.mp = 50;
        this.atk = 25;
        this.def = 0;
    }

    protected void useAction(Knight a, Knight b, String action) {
        if (b != null) {
            System.out.printf("%s %s %s%n", a.getName(), action, b.getName());
        } else {
            System.out.printf("%s use %s%n", a.getName(), action);
        }

    }

    protected void affect(Knight a, String text, Supplier supplier) {
        System.out.println("\t" + a.getName() + " -> " + text + " : " + supplier.get());
    }

    protected boolean isDead(Knight target) {

        if (target.isAlive() && target.getHp() <= 0)
            target.setAlive(false);

        if (!target.isAlive())
            System.out.println(target.getName() + " is Dead");

        return !target.isAlive();
    }

    protected void attack(Knight target) {

        useAction(this, target, "Attack");
        if (isDead(target))
            return;
        target.setHp(Math.max(0, target.getHp() - Math.max(0, this.getAtk() - target.getDef())));
        affect(target, "Hp", target::getHp);

    }

    protected boolean useMp(double use) {
        double mp = this.getMp() - use;
        if (mp >= 0) {
            this.setMp(mp);
            System.out.println("\t"+this.getName() +" Use " + use +" Mp => " +this.getMp());
            return true;
        }
        System.out.println("\tCan't use skill");
        return false;
    }

    protected void doubleAttack(Knight target) {

        useAction(this, target, "Double Attack");
        if (isDead(target))
            return;
        if (this.useMp(20)){
            target.setHp(Math.max(0, target.getHp() - Math.max(0, this.getAtk() * 2 - target.getDef())));
            affect(target, "Hp", target::getHp);
        }

    }

    protected void extraHp() {
        useAction(this, null, "ExtraHp");
        this.setHp(this.getHp() * 2);
        affect(this, "Hp", this::getHp);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }


    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
