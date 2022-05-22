package lession_02;

import java.util.Scanner;

public class Lab_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your inputted number is even number");
        } else {
            System.out.println("Your input number is odd number");
        }
    }
}
