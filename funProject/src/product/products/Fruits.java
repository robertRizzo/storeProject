package product.products;

import product.Product;

public class Fruits extends Product {
    public Fruits(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public Fruits(String name, double price) {
        super(name, price);
    }

    public String getName(String name){
        return super.getName();
    }


    @Override
    public String toString() {
        return super.getName();
    }
}
