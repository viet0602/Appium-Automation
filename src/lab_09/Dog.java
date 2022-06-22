package lab_09;


import java.security.SecureRandom;

public class Dog extends Animal {
    private static int DOG_MAX_SPEED = 60;

    public Dog() {
        super(DOG_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        return Dog.class.getSimpleName();
    }
}
