package com.bptn.course._20_junit_books;

public class Textbook extends Book {
    private int edition;

    // Constructor
    public Textbook(String title, double price, int edition) {
        super(title, price); // Call the superclass constructor
        this.edition = edition; // Assign edition
    }

    // Override method to get book info
    @Override
    public String getBookInfo() {
        return super.getBookInfo() + " - " + edition;
    }

    // Getter for edition
    public int getEdition() {
        return edition;
    }

    // Method to check if this textbook can substitute for another
    public boolean canSubstituteFor(Textbook other) {
        return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
    }
}

