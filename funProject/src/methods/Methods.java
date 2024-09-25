package methods;

import management.Inventory;

import java.util.Scanner;

public interface Methods {
    // Metod för att hantera köp
    public static void handlePurchase(Scanner sc, Inventory inventory, String category) {
        System.out.println("Enter the name of the product you want to buy:");
        String productName = sc.nextLine();
        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();
        sc.nextLine();  // Hantera newline

        boolean success = inventory.buyProduct(category, productName, quantity);

        if (success) {
            System.out.println("Purchase successful!");
        } else {
            System.out.println("Purchase failed.");
        }
    }

}