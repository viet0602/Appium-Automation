package lab_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import static lab_08.Animal.Builder;

public class TestAnimal {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Animal> animalRacingList = new ArrayList<>();
        TestAnimal testAnimal = new TestAnimal();
        Builder animalBuilder = new Builder();
        Animal animal1 = animalBuilder.setName("Eagle").setFlyable(true).setSpeed(new SecureRandom().nextInt(60)).build();
        Animal animal2 = animalBuilder.setName("Falcon").setFlyable(true).setSpeed(new SecureRandom().nextInt(90)).build();
        Animal animal3 = animalBuilder.setName("Tiger").setFlyable(false).setSpeed(new SecureRandom().nextInt(75)).build();
        Animal animal4 = animalBuilder.setName("Snake").setFlyable(false).setSpeed(new SecureRandom().nextInt(50)).build();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        for (Animal animal : animalList) {
            if (!(animal.isFlyable())) {
                animalRacingList.add(animal);
            }
        }
        testAnimal.getWinner(animalRacingList);
    }

    private Animal getWinner(List<Animal> animalList) {
        Animal animalWin = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > animalWin.getSpeed()) {
                animalWin = animalList.get(i);
            }
        }
        System.out.println("Winner is " + animalWin.getName() + ", with speed: " + animalWin.getSpeed());
        return animalWin;
    }
}
