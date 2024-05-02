package org.example;

public class Human {
    private String name;
    private int age = -1;

    public Human(String name) {
        System.out.println("In String constructor");
        this.name = name;
    }

    public Human(Float name) {
        System.out.println("In Object constructor");
        this.name = name.toString();
    }

    public Human(int age) {
        System.out.println("In int constructor");
        this.age = age;
    }

    public Human(short age) {
        System.out.println("In short constructor");
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
