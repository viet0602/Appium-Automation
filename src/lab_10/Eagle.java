package lab_10;

import java.security.SecureRandom;

public class Eagle extends Animal {
    private static int EAGLE_MAX_SPEED = 80;

    public Eagle() {
        flyable = new Fly();
        setSpeed(new SecureRandom().nextInt(EAGLE_MAX_SPEED));
    }

    @Override
    public String getName() {
        return Eagle.class.getSimpleName();
    }
}
