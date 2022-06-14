package lab_06;

public class Lab_61 {

    public static void main(String[] args) {
        int totalMinutes = 0;
        String inputString = "2hrs and 5 minutes";
        String hourString = inputString.substring(0, 1);
        String minuteString = inputString.substring(9, 10);
        int hours = Integer.valueOf(hourString);
        int minutes = Integer.valueOf(minuteString);
        totalMinutes = hours * 60 + minutes;
        System.out.println("Minutes in total: " + totalMinutes);

    }
}
