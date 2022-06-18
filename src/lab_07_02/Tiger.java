package lab_07_02;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static int TIGER_MAX_SPEED = 100;

    public Tiger() {
        super(TIGER_MAX_SPEED);
    }

    @Override
    public String getName() {
        return Tiger.class.getSimpleName();
    }
}
