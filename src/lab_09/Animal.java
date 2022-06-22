package lab_09;

import java.security.SecureRandom;

public abstract class Animal {
    protected int speed;
    protected String name;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public abstract String getName();

    public abstract int getSpeed();

}

