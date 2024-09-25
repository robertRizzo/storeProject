import management.ProductManager;
import storeMembers.StoreMember;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductManager productManager = new ProductManager();

        boolean keepShopping = true;
        System.out.println("Welcome to the Store!\n");

        while (keepShopping) {
            // Visa huvudmenyn
            System.out.println("Choose what aisle you want to go to:\n");
            System.out.println("1. Fruits");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Visa fruktlistan
                    productManager.listFruits();
                    break;

                case 0:
                    keepShopping = false;
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
            }

            ArrayList<StoreMember> membersList = new ArrayList<>();

            String namn = sc.nextLine();
            int age = sc.nextInt();
            int val = sc.nextInt();
            boolean medlem;
            if (val == 1) {
                medlem = true;
            } else {
                medlem = false;
            }
            StoreMember nyMedlem = new StoreMember(namn, age, medlem);
            membersList.add(nyMedlem);

            for (StoreMember member : membersList) {
                System.out.println(member);
            }
        }
    }
}



/*
 TO-DO

 Skapa en till subKlass
 Gör klart StoreMember -> sedan skapar man metoden addToCart -> skapa en metod som visar kundvagnen showCart etc.
 Skapa en huvudmeny där man kan skapa sin användare och lägga in sitt saldo och information

 */
