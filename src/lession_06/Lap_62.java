package lession_06;

import java.util.Scanner;

public class Lap_62 {

    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner sc = new Scanner(System.in);

        System.out.println("You can input password 3 times !!!");
        int countTime = 1;
        do {
            System.out.print("Please input " + countTime + "st time: ");
            String inputString = sc.next();
            if (inputString.equals(myPassword)) {
                System.out.println("Your password is correct!!!");
                break;
            } else {
                System.out.println("Your password is wrong. Please input again");
                countTime++;
            }
        } while (countTime < 4);


    }
}
