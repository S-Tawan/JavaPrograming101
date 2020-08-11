package Lab5.Ex1;

import java.util.function.Supplier;

public class Mage {
    private String name;
    private double hp;
    private double mp;
    private double atk;
    private double def;
    private boolean alive = true;
    private double maxHp;
    private double maxMp;

    public Mage(String name, double hp, double mp, double atk, double def) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.maxHp = this.hp;
        this.maxMp = this.mp;
    }

    public Mage(String name) {
        this(name, 200, 100, 50, 0);
    }

    public Mage() {
    }

    protected void useAction(Mage a, Mage b, String action) {
        if (b != null) {
            System.out.printf("%s %s %s%n", a.getName(), action, b.getName());
        } else {
            System.out.printf("%s use %s%n", a.getName(), action);
        }

    }

    protected void affect(Mage a, String text, Supplier supplier) {
        System.out.println("\t" + a.getName() + " => " + text + " : " + supplier.get());
    }

    protected boolean isDead(Mage target) {

        if (target.isAlive() && target.getHp() <= 0)
            target.setAlive(false);

        if (!target.isAlive())
            System.out.println(target.getName() + " is Dead");

        return !target.isAlive();
    }

    protected void attack(Mage target) {

        useAction(this, target, "Attack");
        if (isDead(target))
            return;
        target.setHp(Math.max(0, target.getHp() - Math.max(0, this.getAtk() - target.getDef())));
        affect(target, "Hp", target::getHp);
        isDead(target);

    }

    protected boolean useMp(double use) {
        double mp = this.getMp() - use;
        if (mp >= 0) {
            this.setMp(mp);
            System.out.println("\t" + this.getName() + " Use " + use + " Mp => " + this.getMp());
            return true;
        }
        System.out.println("\tCan't use skill");
        return false;
    }

    protected void doubleAttack(Mage target) {

        useAction(this, target, "Double Attack");
        if (isDead(target))
            return;
        if (this.useMp(20)) {
            target.setHp(Math.max(0, target.getHp() - Math.max(1, this.getAtk() * 2 - target.getDef())));
            affect(target, "Hp", target::getHp);
            isDead(target);
        }

    }

    protected void heal(Mage target) {
        useAction(this, target, "Heal");
        if (isDead(target))
            return;
        if (this.useMp(20)) {
            target.setHp(Math.min(target.getMaxHp(), target.getHp() + ((this.getHp() * 20) / 100)));
            affect(target, "Hp", this::getHp);
            isDead(target);
        }
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", atk=" + atk +
                ", def=" + def +
                ", alive=" + alive +
                ", maxHp=" + maxHp +
                ", maxMp=" + maxMp +
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

    public double getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(double maxHp) {
        this.maxHp = maxHp;
    }

    public double getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(double maxMp) {
        this.maxMp = maxMp;
    }
}
