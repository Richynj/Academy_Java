package com.bptn.course._Custom_Exception;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        try {
            // Try purchasing 11 apples
            store.purchase("apple", 11);
            System.out.println("Purchase successful!");
        } catch (OutOfStockException e) {
            // Handle the exception and print the message
            System.out.println(e.getMessage());
        }
    }
}

