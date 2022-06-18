package lab_08;

import java.security.SecureRandom;

public class Animal {
    private String name = "Falcon";
    private int speed = 60;
    private boolean flyable = true;

    protected Animal(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    //Read only
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    //Customer service
    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        //Write only
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }

    }
}
