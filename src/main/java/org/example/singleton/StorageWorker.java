package org.example.singleton;

public class StorageWorker {
    public static void main(String[] args) {
        NumberStorage storage = NumberStorage.getInstance();

        System.out.println("storage.getNumbers() = " + storage.getNumbers());

        storage.add(500);

    }
}
