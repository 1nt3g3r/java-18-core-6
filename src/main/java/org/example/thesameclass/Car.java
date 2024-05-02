package org.example.thesameclass;

public class Car {
    public Car(String name) {
        this();

        System.out.println("Create car with name");
    }

    public Car(String name, int year) {
        this();

        System.out.println("Create car with name and year");
    }

    public Car() {
        System.out.println("New car created");
    }
}
