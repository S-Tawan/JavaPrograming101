package Lab4.Ex2;

public class Car {
    private int position;
    private int velocity;
    private String brand;

    public Car(int position, int velocity, String brand) {
        this.position = position;
        this.velocity = velocity;
        this.brand = brand;
    }

    public Car(String brand) {
        this.brand = brand;
        this.position = 0;
        this.velocity = 1;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "position=" + position +
                ", velocity=" + velocity +
                ", brand='" + brand + '\'' +
                '}';
    }

    protected void speedUp(){
        System.out.printf("\t%s Speed up ----> %n",this.brand);
        this.setVelocity(this.getVelocity()+1);
    }
    protected void speedDown(){

        System.out.printf("\t%s Speed down <---- %n",this.brand);
        this.setVelocity(Math.max(0,this.getVelocity()-1));

    }
    protected void calculate(){
        this.setPosition(this.getPosition()+velocity);
        System.out.println(this);
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
