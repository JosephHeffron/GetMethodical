import java.util.Scanner;

public class SafeInput {

    /**
     * Get a non-zero length string input from the user.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString;
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine().trim(); // Trim to remove leading/trailing spaces
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Get an integer input from the user.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an integer value entered by the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        System.out.print(prompt + ": ");
        while (!pipe.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            System.out.print(prompt + ": ");
            pipe.next(); // Consume invalid input
        }
        return pipe.nextInt();
    }

    /**
     * Get a double input from the user.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a double value entered by the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        System.out.print(prompt + ": ");
        while (!pipe.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a double.");
            System.out.print(prompt + ": ");
            pipe.next(); // Consume invalid input
        }
        return pipe.nextDouble();
    }

    /**
     * Get an integer input within a specified inclusive range.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low    low value for the input range
     * @param high   high value for the input range
     * @return an integer value within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int input;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            while (!pipe.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print(prompt + " [" + low + " - " + high + "]: ");
                pipe.next(); // Consume invalid input
            }
            input = pipe.nextInt();
        } while (input < low || input > high);
        return input;
    }

    /**
     * Get a double input within a specified inclusive range.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low    low value for the input range
     * @param high   high value for the input range
     * @return a double value within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double input;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            while (!pipe.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a double.");
                System.out.print(prompt + " [" + low + " - " + high + "]: ");
                pipe.next(); // Consume invalid input
            }
            input = pipe.nextDouble();
        } while (input < low || input > high);
        return input;
    }

    /**
     * Get a Yes or No confirmation from the user.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return true if user confirms with 'Y' or 'y', false otherwise
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + " [Y/N]: ");
            input = pipe.nextLine().trim().toLowerCase();
        } while (!input.equals("y") && !input.equals("n"));
        return input.equals("y");
    }

    /**
     * Get a string input from the user that matches a specified regex pattern.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx  regex pattern to match
     * @return a string input from the user matching the regex pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine().trim();
        } while (!input.matches(regEx));
        return input;
    }

    /**
     * Creates a pretty header with the message centered.
     *
     * @param msg the message to be centered in the header
     */
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgLength = msg.length();
        int spacesNeeded = (totalWidth - 6 - msgLength) / 2; // Calculate spaces needed on each side

        // Print the top line of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the second line with stars and centered message
        System.out.print("***");
        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }
        // If the message length is odd, add one more space at the end
        if (msgLength % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom line of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

