package lession_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<Integer>();
        boolean isContinuing = true;
        while (isContinuing) {
            showMenu();
            int option = getMenuOption();
            switch (option) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    System.out.println("You need to add your array number first!!!");
                    myArrayList = addNumber();
                    System.out.print("Your array number is: ");
                    printNumbers(myArrayList);
                    break;
                case 3:
                    System.out.println("You need to add your array number first!!!");
                    myArrayList = addNumber();
                    getMaxNumber(myArrayList);
                    break;
                case 4:
                    System.out.println("You need to add your array number first!!!");
                    myArrayList = addNumber();
                    getMinNumber(myArrayList);
                    break;
                case 0:
                    System.out.println("Exit!!!");
                    isContinuing = false;
                default:
                    return;
            }
        }

    }

    public static void showMenu() {
        System.out.println("=======MENU=======");
        System.out.println("1. Add  number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("0. Exit");
    }

    public static int getMenuOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select your option: ");
        return sc.nextInt();
    }

    public static List addNumber() {
        List<Integer> myArrayList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number do you want to add: ");
        int countNumber = sc.nextInt();
        for (int i = 0; i < countNumber; i++) {
            int number = sc.nextInt();
            myArrayList.add(number);
        }
        return myArrayList;
    }

    public static void printNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n");
    }

    public static int getMaxNumber(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Max number: " + max);
        return max;

    }

    public static int getMinNumber(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println("Min number: " + min);
        return min;

    }
}
