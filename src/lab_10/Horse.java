package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static int HORSE_MAX_SPEED = 90;

    public Horse() {
        flyable = new FlyNoway();
        setSpeed(new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }

    @Override
    public String getName() {
        return Horse.class.getSimpleName();
    }
}
