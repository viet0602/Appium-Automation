package lab_03;

public class Lab_31 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int countEven = 0;
        int countOdd = 0;
        for (int index = 0; index < 5; index++) {
            if (intArr[index] % 2 == 0) {
                countEven++;
            } else if (intArr[index] % 2 == 1) {
                countOdd++;
            }
        }
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
