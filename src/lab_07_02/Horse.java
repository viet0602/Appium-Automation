package lab_07_02;

import java.security.SecureRandom;

public class Horse extends Animal {
    private int MAX_SPEED = 75;

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }

    @Override
    public String getName() {
        return Horse.class.getSimpleName();
    }
}
