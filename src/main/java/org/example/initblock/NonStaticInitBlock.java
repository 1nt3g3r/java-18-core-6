package org.example.initblock;

public class NonStaticInitBlock {
    public static int instanceCount;

    {
        instanceCount++;
        System.out.println("New instance created, total instances: " + instanceCount);
    }

    public NonStaticInitBlock() {
        if (instanceCount >= 10) {
            throw new IllegalArgumentException("You can't create more than 10 instance");
        }
    }

    public static void printInstanceCount() {
        System.out.println("instanceCount = " + instanceCount);
    }

    public static void main(String[] args) {
        new NonStaticInitBlock();
        for(int i = 0; i < 100; i++) {
            new NonStaticInitBlock();
        }
    }
}
