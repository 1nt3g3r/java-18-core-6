package org.example.inheritance;

public class ABLauncher {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println("a instanceof A = " + (a instanceof A));
        System.out.println("(b instanceof A) = " + (b instanceof A));
    }
}
