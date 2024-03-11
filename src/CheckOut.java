import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;

        do {
            // Prompt the user for the price of the item
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 - $10.00):", 0.50, 10.00);
            totalCost += price;

            // Ask if the user has more items to add
            boolean hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to add?");

            if (!hasMoreItems)
                break; // Exit the loop if the user doesn't have more items

        } while (true);

        // Display the total cost of the items
        System.out.printf("Total cost of the items: $%.2f\n", totalCost);
    }
}
