package management;

import product.products.Fruits;
import product.products.Meat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    // Konstruktor för att ta emot Inventory
    public ProductManager(Inventory inventory) {
    }

    private ArrayList<Fruits> allFruits;
    private ArrayList<Meat> allMeats;

    public ProductManager() {
        allFruits = new ArrayList<>();
        allMeats = new ArrayList<>();
        initializeProducts();
    }



    // Metod för att skapa några standardprodukter

    private void initializeProducts() {
        // Lägg till frukter
        allFruits.add(new Fruits("Banana", 8, 50));
        allFruits.add(new Fruits("Apple", 7, 68));
        allFruits.add(new Fruits("Orange", 12, 24));
        allFruits.add(new Fruits("Watermelon", 20, 5));

        // Lägg till kött
        allMeats.add(new Meat("Beef", 100, 15));
        allMeats.add(new Meat("Chicken", 80, 15));

    }

    // Metod för att lista produkterna
    public void listFruits() {
        System.out.println("Available fruits:\n");
        for (Fruits fruit : allFruits) {
            System.out.println(fruit);
        }
    }
    public List<Fruits> getAllFruits() {
        return allFruits;
    }

    public void listMeats() {
        System.out.println("Available meats:\n");
        for (Meat meat : allMeats) {
            System.out.println(meat);
        }
    }
    public List<Meat> getAllMeats() {
        return allMeats;
    }
}
