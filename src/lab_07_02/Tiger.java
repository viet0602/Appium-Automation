package lab_07_02;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private int MAX_SPEED = 100;

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }

    @Override
    public String getName() {
        return Tiger.class.getSimpleName();
    }
}
