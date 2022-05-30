package HomeWork_4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        WordsArray();
        PhoneBookGo();
    }

    private static void WordsArray() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Class", "Cat", "Cat", "Box", "Fox", "People",
                "Human", "Dog", "People",  "Dog", "Class", "Bike", "Class"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void PhoneBookGo() {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Petrov", "8945265552");
        phonebook.add("Sidorov", "89156695585");
        phonebook.add("Ivanov", "891845522558");
        phonebook.add("Smirnov", "8915666215");
        phonebook.add("Petrov", "82047862265");
        phonebook.add("Sidorov", "8990056256");
        phonebook.add("Ivanov", "8977885255");
        phonebook.add("Smirnov", "8965489222");
        phonebook.add("Loktev", "8955855215");

        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Sidorov"));
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Smirnov"));
        System.out.println(phonebook.get("Loktev"));
    }
}

