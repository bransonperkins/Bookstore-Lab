package com.win.bookstore;

import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {

    // create private properties
    private String address = "123 Main St";
    private String name = "Branson's Books";

    // create public properties
    public int squareFeet;
    public String openingTime;
    public String closingTime;
    public String date;
    public boolean openToday;
    public boolean hasUsedBooks;
    public boolean hasNewBooks;
    public boolean openOnWeekends;
    public String book;

    // create private properties
    public ArrayList<String> titles;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    // no-arg constructor
    public Bookstore() {
        openingTime = "8:00 AM";
        closingTime = "10:00 PM";
        openToday = true;
        hasUsedBooks = true;
        hasNewBooks = true;
        openOnWeekends = true;
        squareFeet = 3500;
    }

    // constructors with arguments
    public Bookstore(String openingTime, String closingTime) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;

        titles = new ArrayList<String>();
        loadTitles();
    }

    public Bookstore(String name, String address, int squareFeet) {
        this.name = name;
        this.address = address;
        this.squareFeet = squareFeet;
    }

    // constructor with one argument
    public Bookstore(String openingTime) {
        this.openingTime = openingTime;
    }

    // method that will determine if the store is open or not on a certain day
    public void isStoreOpenToday() {
        if (openToday) {
            System.out.println("The store is open today.");
        } else {
            System.out.println("The store is not open today.");
        }
    }

    // method that determines if the bookstore stocks new or used books
    public void newOrUsedBooks() {
        if (!hasNewBooks && !hasUsedBooks) {
            System.out.println("Looks like this isn't a book store...");
        } else if (hasUsedBooks && hasNewBooks) {
            System.out.println("Great news! They have new and used books.");
        } else if (hasNewBooks) {
            System.out.println("They don't have used books but they do have new ones!");
        } else {
            System.out.println("They don't have new books but they do have used ones!");
        }
    }

    public void loadTitles()
    {
        try
        {
            Utils.loadStringsToArray(this.titles);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initialize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();
        }
    }

    // method that will determine if book is in stock or not
    public void isBookInStock(String book) {
        boolean stocked = false;
        for (String values : titles) {
            if (values.toLowerCase().contains(book.toLowerCase())) {
                stocked = true;
                System.out.println("Yes we do have " + book + " in stock.");
            }
        }
        if (!stocked) {
            System.out.println("Sorry we don't have that book.");
        }
    }

    public void javaBooksInStock(String book) {
        for (String values : titles) {
            if (values.toLowerCase().contains("java")) {
                System.out.println("We have Java books in stock!");
                return;
            }
        }
    }

    // method that will print all books in stock
    public void printTitles() {
        System.out.print("Books we have in stock: ");
        for (String values : titles) {
            System.out.print(values + ", ");
        }
    }

    @Override
    public String toString() {
        return String.format("%s has all the books you need. We are located at %s. We are open from %s to %s.",
                getName(), getAddress(), openingTime, closingTime);
    }

}
