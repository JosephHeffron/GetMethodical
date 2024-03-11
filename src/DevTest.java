import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test getNonZeroLenString method
        testGetNonZeroLenString(scanner);

        // Test getInt method
        testGetInt(scanner);

        // Test getDouble method
        testGetDouble(scanner);

        // Test getRangedInt method
        testGetRangedInt(scanner);

        // Test getRangedDouble method
        testGetRangedDouble(scanner);

        // Test getYNConfirm method
        testGetYNConfirm(scanner);

        // Test getRegExString method
        testGetRegExString(scanner);

        // Test prettyHeader method
        testPrettyHeader();

        scanner.close();
    }

    // Test getNonZeroLenString method
    private static void testGetNonZeroLenString(Scanner scanner) {
        System.out.println("Testing getNonZeroLenString method:");

        // Test case: valid input
        String input1 = SafeInput.getNonZeroLenString(scanner, "Enter a non-zero length string:");
        System.out.println("Input: " + input1);

        // Test case: empty input followed by valid input
        String input2 = SafeInput.getNonZeroLenString(scanner, "Enter a non-zero length string:");
        System.out.println("Input: " + input2);
    }

    // Test getInt method
    private static void testGetInt(Scanner scanner) {
        System.out.println("\nTesting getInt method:");

        // Test case: valid input
        int input1 = SafeInput.getInt(scanner, "Enter an integer:");
        System.out.println("Input: " + input1);

        // Test case: non-integer input
        int input2 = SafeInput.getInt(scanner, "Enter an integer:");
        System.out.println("Input: " + input2);
    }

    // Test getDouble method
    private static void testGetDouble(Scanner scanner) {
        System.out.println("\nTesting getDouble method:");

        // Test case: valid input
        double input1 = SafeInput.getDouble(scanner, "Enter a double:");
        System.out.println("Input: " + input1);

        // Test case: non-double input
        double input2 = SafeInput.getDouble(scanner, "Enter a double:");
        System.out.println("Input: " + input2);
    }

    // Test getRangedInt method
    private static void testGetRangedInt(Scanner scanner) {
        System.out.println("\nTesting getRangedInt method:");

        // Test case: valid input within range
        int input1 = SafeInput.getRangedInt(scanner, "Enter an integer within range (1-10):", 1, 10);
        System.out.println("Input: " + input1);

        // Test case: input out of range followed by valid input
        int input2 = SafeInput.getRangedInt(scanner, "Enter an integer within range (1-10):", 1, 10);
        System.out.println("Input: " + input2);
    }

    // Test getRangedDouble method
    private static void testGetRangedDouble(Scanner scanner) {
        System.out.println("\nTesting getRangedDouble method:");

        // Test case: valid input within range
        double input1 = SafeInput.getRangedDouble(scanner, "Enter a double within range (0.5-5.0):", 0.5, 5.0);
        System.out.println("Input: " + input1);

        // Test case: input out of range followed by valid input
        double input2 = SafeInput.getRangedDouble(scanner, "Enter a double within range (0.5-5.0):", 0.5, 5.0);
        System.out.println("Input: " + input2);
    }

    // Test getYNConfirm method
    private static void testGetYNConfirm(Scanner scanner) {
        System.out.println("\nTesting getYNConfirm method:");

        // Test case: valid input (yes)
        boolean input1 = SafeInput.getYNConfirm(scanner, "Do you want to continue?");
        System.out.println("Input: " + input1);

        // Test case: valid input (no)
        boolean input2 = SafeInput.getYNConfirm(scanner, "Do you want to continue?");
        System.out.println("Input: " + input2);
    }

    // Test getRegExString method
    private static void testGetRegExString(Scanner scanner) {
        System.out.println("\nTesting getRegExString method:");

        // Test case: valid input matching regex pattern
        String input1 = SafeInput.getRegExString(scanner, "Enter a string matching the pattern:", "[a-z]+");
        System.out.println("Input: " + input1);

        // Test case: input not matching regex pattern followed by valid input
        String input2 = SafeInput.getRegExString(scanner, "Enter a string matching the pattern:", "[a-z]+");
        System.out.println("Input: " + input2);
    }

    // Test prettyHeader method
    private static void testPrettyHeader() {
        System.out.println("\nTesting prettyHeader method:");
        SafeInput.prettyHeader("Message Centered Here");
    }
}
