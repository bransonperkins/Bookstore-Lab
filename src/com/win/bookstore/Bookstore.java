package com.win.bookstore;

import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {
    // create public properties
    public String name;
    public String address;
    public int squareFeet;
    public String openingTime;
    public String closingTime;
    public boolean openToday;
    public boolean hasUsedBooks;
    public boolean hasNewBooks;
    public boolean openOnWeekends;
    public String book;

    // create private properties
    public ArrayList<String> titles;

    // no-arg constructor
    public Bookstore() {
        openingTime = "8:00 AM";
        closingTime = "10:00 PM";
        openToday = true;
        hasUsedBooks = true;
        hasNewBooks = true;
        openOnWeekends = true;
    }

    // constructors with arguments
    public Bookstore(String name, String address) {
        this.name = name;
        this.address = address;

        titles = new ArrayList<String>();
        loadTitles();
    }

    public Bookstore(String name, String address, int squareFeet) {
        this.name = name;
        this.address = address;
        this.squareFeet = squareFeet;
    }

    // constructor with one argument
    public Bookstore(String name) {
        this.name = name;
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
        for (String values : titles) {
            if (values.equals(book)) {
                System.out.println("We have " + values + " in stock!");
            } break;
        }
    }

    public void javaBooksInStock(String book) {
        for (String values : titles) {
            if (values.toLowerCase().contains("java")) {
                System.out.println("We have Java books in stock!");
            } break;
        }
    }

    // method that will print all books in stock
    public void printTitles() {
        System.out.print("Books we have in stock: ");
        for (String values : titles) {
            System.out.print(values + ", ");
        }
    }

}
