package lab_02;

import java.util.Scanner;

public class Lab_21_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please in put your weight(kg): ");
        float weight = sc.nextFloat();
        System.out.print("Please in put your height(m): ");
        float height = sc.nextFloat();
        Float bmi = weight / (height * 2);
        System.out.println("Your BMI is: " + bmi);
        if (bmi <= 18.5) {
            System.out.println(" You need to increase " + ((18.5 * height * 2) - weight) + " kg");
        } else if (bmi <= 24.9) {
            System.out.println("You need to keep your weight");
        } else if (bmi <= 29.9) {
            System.out.println("You need to decrease " + (weight - (24.9 * height * 2)) + " kg");
        } else {
            System.out.println("You are being obesity, you have to decrease your weight ASAP!!!");
        }
    }
}
