package lession_03;

public class Lab_33 {

    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};

        System.out.print("Expected output: ");
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                int temp = intArr[0];
                if (intArr[i] > intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
            System.out.print(intArr[i] + " ");
        }
    }
}
