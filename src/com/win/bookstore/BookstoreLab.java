package com.win.bookstore;

import com.win.bookstore.Book.Novel;

import java.util.Scanner;
import java.time.DayOfWeek;

public class BookstoreLab {

    public static void main(String[]args) {

        Bookstore store1 = new Bookstore();

        // print the store's description
        System.out.println(store1);

        System.out.println("How big is the store?");
        System.out.println(store1.getSquareFeet());

        // call the method that checks if they have new or used books
        System.out.println("Does the store have new or used books?");
        store1.newOrUsedBooks();

        // instantiate new bookstore object to test some new methods
        Bookstore store2 = new Bookstore("9:00AM", "7:30PM");
        System.out.println(store2.getOpeningTime());

        // create scanner to get user inputs
        Scanner userInput = new Scanner(System.in);

        // test method to see if they have a certain book in stock
        store2.loadTitles();
        System.out.print("What book are you looking for? ");
        String desiredBook = userInput.nextLine();
        store2.isBookInStock(desiredBook);

        // test method to see if they have a java book in stock
        System.out.print("Any other books you are looking for? ");
        String javaBook = userInput.next();
        store2.javaBooksInStock(javaBook);

        Book book = new Book("Harry Potter", 500);
        Novel novel = new Novel("Freakonomics", 300, "economics");
        System.out.println(novel.genre);

    }

}