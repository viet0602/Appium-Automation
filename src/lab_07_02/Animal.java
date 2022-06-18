package lab_07_02;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return this.speed;
    }

}
