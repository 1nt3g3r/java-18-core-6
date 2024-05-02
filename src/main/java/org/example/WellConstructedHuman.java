package org.example;

public class WellConstructedHuman {
    private String name;
    private int age;

    public WellConstructedHuman(String name, int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("age=" + age + ", it should be between 0 and 150 inclusive");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name should not be null or blank");
        }

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "WellConstructedHuman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        WellConstructedHuman human = new WellConstructedHuman("t", 25);
        System.out.println("human = " + human);
    }
}
