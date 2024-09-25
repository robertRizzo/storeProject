package management;

import product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    // En Map för att hålla alla produkter kategoriserade
    private Map<String, List<Product>> productCategories;

    public Inventory() {
        productCategories = new HashMap<>();
    }

    // Metod för att lägga till produkter i rätt kategori
    public void addProduct(String category, Product product) {
        productCategories.putIfAbsent(category, new ArrayList<>()); // Skapa lista om kategorin inte finns
        productCategories.get(category).add(product); // Lägg till produkten i rätt kategori
    }

    // Metod för att lista produkter i en viss kategori
    public void listProductsByCategory(String category) {
        List<Product> products = productCategories.get(category);
        if (products != null) {
            System.out.println("Available products in category: " + category);
            for (Product product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("No products available in this category.");
        }
    }

    // Hämta produkter från en specifik kategori
    public List<Product> getProductsByCategory(String category) {
        return productCategories.getOrDefault(category, new ArrayList<>());
    }

    // Hantera köp av produkt från en viss kategori
    public boolean buyProduct(String category, String productName, int quantity) {
        List<Product> products = productCategories.get(category);

        if (products != null) {
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(productName)) {
                    if (product.getQuantity() >= quantity) {
                        product.setQuantity(product.getQuantity() - quantity);
                        System.out.println("Purchase successful! " + quantity + " units of " + productName + " bought.");
                        return true;
                    } else {
                        System.out.println("Not enough stock for " + productName);
                        return false;
                    }
                }
            }
            System.out.println(productName + " not found in category " + category);
        } else {
            System.out.println("Category " + category + " not found.");
        }

        return false;
    }
}
