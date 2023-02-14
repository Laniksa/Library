package com.company;

public class Main {

    public static void main(String[] args) {
//        User Vasya = new Librarian();
//        User Petya = new Supplier();

        Librarian vasya = new Librarian("Вася");
        Supplier petya = new Supplier("Петя");
        Book book = new Book("Война и мир");
        vasya.bookApplication(vasya,petya,book);




    }
}
