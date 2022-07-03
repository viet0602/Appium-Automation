package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static int TIGER_MAX_SPEED = 100;

    public Tiger() {
        flyable = new FlyNoway();
        setSpeed(new SecureRandom().nextInt(TIGER_MAX_SPEED));
    }

    @Override
    public String getName() {
        return Tiger.class.getSimpleName();
    }
}
