package org.example.abstracttest;

public class AnotherClass extends TestClass{
    public static void main(String[] args) {
        Object c = new AnotherClass();

        if (c instanceof Flyable) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println(c);
    }
}
