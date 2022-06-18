package lab_07_02;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static int DOG_MAX_SPEED = 60;

    public Dog() {
        super(DOG_MAX_SPEED);
    }

    @Override
    public String getName() {
        return Dog.class.getSimpleName();
    }
}
