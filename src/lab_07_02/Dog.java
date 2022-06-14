package lab_07_02;

import java.security.SecureRandom;

public class Dog extends Animal {
    private int MAX_SPEED = 60;

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }

    @Override
    public String getName() {
        return Dog.class.getSimpleName();
    }
}
