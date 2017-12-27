package com.example.macbook.myapp;

public class Person {

    String names;
    String surname;

    public Person(String names, String surname) {
        this.names = names;
        this.surname = surname;
    }


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
