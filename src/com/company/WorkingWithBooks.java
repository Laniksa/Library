package com.company;

public interface WorkingWithBooks {
    static void fightingBooks(User user){
        System.out.println("Читатель взял книгу");
    }

    static void refungBooks(User user){
        System.out.println("Читатель сдал книгу");
    }
    static void noticeOfDelay(User user){
        System.out.println("Уведомление о просрочке");
    }
}
