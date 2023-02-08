package com.company;

public interface Administrator {
    public static void overdueNotification(Reader reader){
        System.out.println("Читатель " + "" + "просрочил срок сдачи книги");
    }
}
