package com.company;

public class Administrator extends User implements WorkingWithBooks{
    String name;
    public Administrator(String name){
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
