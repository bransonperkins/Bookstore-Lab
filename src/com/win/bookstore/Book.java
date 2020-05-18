package com.win.bookstore;

public class Book {
    String title;
    int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public static class Novel extends Book {
        String genre;
        Novel(String title, int numberOfPages, String genre) {
            super(title, numberOfPages);
            this.genre = genre;
        }
        void haveIRead(boolean haveIRead) {
            if (haveIRead) {
                System.out.println("I have read this!");
            } else {
                System.out.println("I haven't read this yet.");
            }
        }
    }

    public static class Textbook extends Book {
        float price;
        Textbook (int numberOfPages, String title, float price) {
            super(title, numberOfPages);
            this.price = price;
        }

        void canIAfford(boolean canIAfford) {
            if (canIAfford) {
                System.out.println("I have read this!");
            } else {
                System.out.println("I haven't read this yet.");
            }
        }
    }

}
