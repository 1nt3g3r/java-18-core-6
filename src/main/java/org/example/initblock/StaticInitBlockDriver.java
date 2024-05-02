package org.example.initblock;

public class StaticInitBlockDriver {
    static {
        System.out.println("Loading system libraries...");
    }

    public static void main(String[] args) {
        System.out.println("Load driver");
    }
}
