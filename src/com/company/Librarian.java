package com.company;

public class Librarian extends User implements BookApplication {
    String name;
    public Librarian(String name){
        this.name = name;
}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void bookApplication(Librarian librarian, Supplier supplier, Book book){
        System.out.println("Библиотекарь "+ librarian.getName() +
                " заказывает у поставщика " + supplier.getName() +
                " книгу " + book.getName());
    }
}
