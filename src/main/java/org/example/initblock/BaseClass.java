package org.example.initblock;

public class BaseClass {
    {
        System.out.println("Init block");
    }

    static {
        System.out.println("Static init block");
    }

    {
        System.out.println("Another init block");
    }

    public BaseClass() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
//        new BaseClass();
//        System.out.println("PAUSE");
//        new BaseClass();

        System.out.println("Hello World");
    }
}
