package com.company;

public interface TakesAndReturnsBooks {
    static void takesAndReturnsBooks(User user){
        System.out.println("Читатель " + "" + "просрочил срок сдачи книги");
    }

    static void fightingBooks(User user){
        System.out.println("Читатель взял книгу");
    }

    static void refungBooks(User user){
        System.out.println("Читатель сдал книгу");
    }
}
