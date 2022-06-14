package lab_03;

public class Lab_32 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int max = intArr[0];
        int min = intArr[0];
        for (int index = 1; index < 5; index++) {
            if (intArr[index] < min) {
                min = intArr[index];
            }
            if (intArr[index] > min) {
                max = intArr[index];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
