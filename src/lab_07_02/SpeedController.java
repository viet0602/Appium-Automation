package lab_07_02;

import java.util.ArrayList;
import java.util.List;

public class SpeedController {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        SpeedController speedController = new SpeedController();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        speedController.getWinner(animalList);
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
