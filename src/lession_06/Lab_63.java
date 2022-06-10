package lession_06;

import java.util.Scanner;

public class Lab_63 {

    public static void main(String[] args) {
        String myStr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your string (include both characters and numbers): ");
        myStr = sc.nextLine();

        char[] myChar = myStr.toCharArray();
        for (char myDigit : myChar) {
            if (Character.isDigit(myDigit)) {
                System.out.print(myDigit);
                continue;
            }
        }
    }
}
