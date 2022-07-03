package lab_10;

public class Animal {

    Flyable flyable;
    private int speed;
    private String name;

    boolean flyAble() {
        return flyable.fly();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

}
