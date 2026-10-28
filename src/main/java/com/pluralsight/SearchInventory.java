package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

// Starter for Search Inventory (Workbook 3a, Section 3-2 Using an ArrayList, Exercise 1).
// main is done: it asks getInventory() for the list and prints every product.
// Your job is getInventory(): fill the list with at least 5 products.
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        // Write your code here
        inventory.add(new Product(1007, "Laptop", 1199.99));
        inventory.add(new Product(2121, "Phone", 744.99));
        inventory.add(new Product(3045, "Console", 599.99));
        inventory.add(new Product(4003, "Controller", 59.99));
        inventory.add(new Product(5785, "Tablet", 999.99));
        return inventory;
    }
    public static BufferedReader getProduct(){
        // Add buffered reader and Split the items
        String fileName = "inventory.csv";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            // Skip first line
            bufferedReader.readLine();

            String items;
            while ((items = bufferedReader.readLine()) != null){
                String[] tokens = items.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double price = Double.parseDouble(tokens[2]);

                Product product = new Product(id, name, price);

            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return inventory;
    }
}
