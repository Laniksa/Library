package com.company;

public interface Reader {
    public static void fightingBooks(Reader reader){
        System.out.println("Читатель взял книгу");
    }

    public static void refungBooks(Reader reader){
        System.out.println("Читатель сдал книгу");
    }
}
