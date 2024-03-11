import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get SSN from the user
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: XXX-XX-XXXX):", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN entered: " + ssn);

        // Get UC Student M number from the user
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: MXXXXX):", "^(M|m)\\d{5}$");
        System.out.println("UC Student M number entered: " + mNumber);

        // Get menu choice from the user
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O for Open, S for Save, V for View, Q for Quit):", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + menuChoice);
    }
}
