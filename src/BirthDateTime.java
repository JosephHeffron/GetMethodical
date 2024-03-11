import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input year of birth (1950-2015)
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);

        // Input month of birth (1-12)
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);

        // Input day of birth (1-31)
        int day = getDay(in, month); // Day depends on the month

        // Input hour of birth (1-24)
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth (1 - 24)", 1, 24);

        // Input minute of birth (1-59)
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);

        // Display the birthdate and time
        System.out.println("\nYour date and time of birth is: " + month + "/" + day + "/" + year + " " + hour + ":" + minute);
    }

    // Method to get the day of birth based on the month
    private static int getDay(Scanner in, int month) {
        switch (month) {
            case 2: // February
                return SafeInput.getRangedInt(in, "Enter the day of your birth (1 - 28)", 1, 28);
            case 4: case 6: case 9: case 11: // April, June, September, November
                return SafeInput.getRangedInt(in, "Enter the day of your birth (1 - 30)", 1, 30);
            default: // January, March, May, July, August, October, December
                return SafeInput.getRangedInt(in, "Enter the day of your birth (1 - 31)", 1, 31);
        }
    }
}
