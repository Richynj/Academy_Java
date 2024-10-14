package com.bptn.course._Custom_Exception;

//Customized Exception Class for when a product is out of stock

public class OutOfStockException extends Exception {
 
 // Constructor that takes a String message as a parameter
 public OutOfStockException(String message) {
     // Call the superclass constructor with the message
     super(message);
 }
}
