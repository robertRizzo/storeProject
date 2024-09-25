package product.products;

import product.Product;

public class Meat extends Product {
    private String meatType;
    public Meat(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // Getter och setter för meatType
    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return super.toString() + ", MeatType: " + meatType;
    }
}
