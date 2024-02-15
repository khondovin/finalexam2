package org.example;


public class Main {


    public static void main(String[] args) {

        // Create customers of different types
        Customer premiumCustomer = new Customer("Alice", "Premium");
        Customer goldCustomer = new Customer("Bob", "Gold");
        Customer silverCustomer = new Customer("Charlie", "Silver");
        Customer normalCustomer = new Customer("David", "Normal");

        // Create a sale for each customer
        Sale premiumSale = new Sale(premiumCustomer, "2024-02-15", 100.0, 200.0);
        Sale goldSale = new Sale(goldCustomer, "2024-02-15", 50.0, 150.0);
        Sale silverSale = new Sale(silverCustomer, "2024-02-15", 25.0, 75.0);
        Sale normalSale = new Sale(normalCustomer, "2024-02-15", 40.0, 100.0);

        // Display information for each sale
        System.out.println("Premium Customer Sale:");
        premiumSale.displayInfo();
        System.out.println();

        System.out.println("Gold Customer Sale:");
        goldSale.displayInfo();
        System.out.println();

        System.out.println("Silver Customer Sale:");
        silverSale.displayInfo();
        System.out.println();

        System.out.println("Normal Customer Sale:");
        normalSale.displayInfo();
        System.out.println();
    }
}