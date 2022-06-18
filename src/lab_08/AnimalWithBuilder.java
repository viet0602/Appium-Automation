package lab_08;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private String name = "Falcon";
    private int speed = 60;
    private boolean flyable = true;

    public AnimalWithBuilder() {
    }

    protected AnimalWithBuilder(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    //Read only
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return new SecureRandom().nextInt(speed);
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

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }

}
