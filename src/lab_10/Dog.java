package lab_10;

import lab_09.Horse;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static int DOG_MAX_SPEED = 80;

    public Dog() {
        flyable = new FlyNoway();
        setSpeed(new SecureRandom().nextInt(DOG_MAX_SPEED));
    }

    @Override
    public String getName() {
        return Dog.class.getSimpleName();
    }
}
