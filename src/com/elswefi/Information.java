package com.elswefi;

import java.io.Serializable;

public class Information implements Serializable{
    private final String name;
    private final String lastName;
    private int age;

    public Information(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " (" + age+ ")";
    }
}
