package com.win.bookstore;

import java.util.Scanner;

public class BookstoreLab {

    public static void main(String[]args) {

        // instantiate new bookstore object
        Bookstore store1 = new Bookstore();
        store1.name = "Books A Million";
        store1.address = "123 Main St";
        store1.squareFeet = 3500;

        // fill in answers to questions by accessing the Bookstore class properties and methods
        System.out.println("What is the address?");
        System.out.println(store1.address);

        System.out.println("Is the store open today?");
        store1.isStoreOpenToday();

        System.out.println("What time does it close?");
        System.out.println(store1.closingTime);

        System.out.println("How big is the store");
        System.out.println(store1.squareFeet);

        System.out.println("Does the store have new or used books?");
        store1.newOrUsedBooks();

        // create scanner to get user inputs
        Scanner userInput = new Scanner(System.in);

        // instantiate new bookstore object to test some new methods
        Bookstore store2 = new Bookstore("Barnes & Noble", "704 Queen St");
        // test method to see if they have a certain book in stock
        System.out.print("What book are you looking for? ");
        String desiredBook = userInput.next();
        store2.isBookInStock(desiredBook);

        // test method to see if they have a java book in stock
        System.out.print("Any other books you are looking for? ");
        String javaBook = userInput.next();
        store2.javaBooksInStock(javaBook);

        store2.loadTitles();

    }

}