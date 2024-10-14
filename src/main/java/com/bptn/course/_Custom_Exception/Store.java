package com.bptn.course._Custom_Exception;

import java.util.HashMap;
import java.util.Map;

public class Store {
    
    // Map to store product names and their quantities
    private Map<String, Integer> products;

    // Constructor to initialize the store with some default products
    public Store() {
        products = new HashMap<>();
        products.put("apple", 10);
        products.put("banana", 5);
        products.put("orange", 0);
    }

    // Method to purchase a product from the store
    public void purchase(String product, int quantity) throws OutOfStockException {
        // Check if the product exists in the store
        if (!products.containsKey(product)) {
            throw new OutOfStockException("Product " + product + " not available in store");
        }

        // Check if there is enough stock for the requested quantity
        if (products.get(product) < quantity) {
            throw new OutOfStockException("Product " + product + " out of stock");
        }

        // If the product is available and stock is sufficient, reduce the stock
        products.put(product, products.get(product) - quantity);
        System.out.println(quantity + " " + product + "(s) purchased!");
    }
}
