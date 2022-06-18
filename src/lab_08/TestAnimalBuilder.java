package lab_08;

import java.util.ArrayList;
import java.util.List;

import static lab_08.AnimalWithBuilder.Builder;

public class TestAnimalBuilder {

    public static void main(String[] args) {
        List<AnimalWithBuilder> animalList = new ArrayList<>();
        TestAnimalBuilder testAnimalBuilder = new TestAnimalBuilder();
        Builder builder = new Builder();
        AnimalWithBuilder animal1 = builder.setName("Eagle").setFlyable(true).setSpeed(120).build();
        AnimalWithBuilder animal2 = builder.setName("Falcon").setFlyable(true).setSpeed(90).build();
        AnimalWithBuilder animal3 = builder.setName("Tiger").setFlyable(false).setSpeed(100).build();
        AnimalWithBuilder animal4 = builder.setName("Snake").setFlyable(false).setSpeed(60).build();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        testAnimalBuilder.racingAnimal(animalList);
    }

    private AnimalWithBuilder racingAnimal(List<AnimalWithBuilder> animalList) {
        AnimalWithBuilder animalWin = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > animalWin.getSpeed()) {
                animalWin = animalList.get(i);
            }

        }
        System.out.println("Winner is " + animalWin.getName() + ", with speed: " + animalWin.getSpeed() + " and can fly: " + animalWin.isFlyable());
        return animalWin;
    }
}
