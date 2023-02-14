package com.company;

public class Reader extends User implements TakesAndReturnsBooks {
    String name;
    public Reader(String name){
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
