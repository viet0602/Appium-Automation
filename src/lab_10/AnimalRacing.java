package lab_10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        AnimalRacing animalRacing = new AnimalRacing();
        Animal dog = new Dog();
        Animal eagle = new Eagle();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        animalList.add(dog);
        animalList.add(eagle);
        animalList.add(horse);
        animalList.add(tiger);
        animalRacing.getWinner(animalList);
    }

    Animal getWinner(List<Animal> animalList) {
        List<Animal> nonFlyableAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.flyAble()) {
                nonFlyableAnimals.add(animal);
            }
        }
        //Get Winner
        Animal animalWin = nonFlyableAnimals.get(0);
        for (int i = 1; i < nonFlyableAnimals.size(); i++) {
            if (nonFlyableAnimals.get(i).getSpeed() > animalWin.getSpeed()) {
                animalWin = nonFlyableAnimals.get(i);
            }
        }
        System.out.println("Winner is " + animalWin.getName() + ", with speed: " + animalWin.getSpeed());
        return animalWin;
    }
}
