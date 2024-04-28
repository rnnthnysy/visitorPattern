package visitorPattern;
import java.util.Scanner;
public class ECommerceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the type and size of furniture
        System.out.println("Welcome to the Furniture Store!");
        System.out.println("Please enter the type of furniture you want to purchase (chair, table, sofa):");
        String furnitureType = scanner.nextLine().toLowerCase();

        // Create furniture objects based on user input
        Furniture furniture = createFurniture(furnitureType);

        // Create shipping cost calculator
        ShippingCostCalculator shippingCalculator = new ShippingCostCalculator();

        // Calculate shipping cost for the furniture
        furniture.accept(shippingCalculator);

        // Display total shipping cost
        System.out.println("Total shipping cost for the " + furnitureType + ": $" + shippingCalculator.getTotalShippingCost());

        // Close scanner
        scanner.close();
    }

    // Factory method to create furniture objects based on user input
    private static Furniture createFurniture(String furnitureType) {
        switch (furnitureType) {
            case "chair":
                return new Chair();
            case "table":
                return new Table();
            case "sofa":
                return new Sofa();
            default:
                throw new IllegalArgumentException("Invalid furniture type: " + furnitureType);
        }
    }
}
