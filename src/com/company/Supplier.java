package com.company;

public class Supplier extends User implements ImportOfBooksOnTheWay{
    String name;
    public Supplier(String name){
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
}
