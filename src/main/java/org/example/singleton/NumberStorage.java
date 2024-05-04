package org.example.singleton;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NumberStorage {
    private static final String FILE_PATH = "./numbers.txt";

    private List<Integer> numbers;

    private static final NumberStorage instance;

    static {
        instance = new NumberStorage();
    }

    public static NumberStorage getInstance() {
        return instance;
    }

    private NumberStorage() {
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            String fileContent = Files.readString(Path.of(FILE_PATH));

            String[] rawNumbers = fileContent.split(",");

            numbers = new ArrayList<>();

            for (String rawNumber : rawNumbers) {
                if (rawNumber.isBlank()) {
                    continue;
                }

                numbers.add(Integer.parseInt(rawNumber));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(int number) {
        numbers.add(number);

        List<String> strNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            strNumbers.add(Integer.toString(num));
        }

        String toSave = String.join(",", strNumbers);

        try {
            Files.writeString(
                    Path.of(FILE_PATH),
                    toSave
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public static void main(String[] args) {
        NumberStorage storage = new NumberStorage();
        System.out.println("storage.numbers = " + storage.numbers);
//        storage.add(1);
//        storage.add(5);
    }
}
