package JavaTask;

import java.util.HashSet;
import java.util.Set;

public class E8Task {
    //9. Write a java program to find the 2 largest number in the array?
    public static void main(String[] args) {
        String[] stringArray = {"Cat", "Dog", "Lion", "Phone", "Cat", "Lion", "Elephant"};

        Set<String> uniqueStrings = new HashSet<>();
        Set<String> duplicateStrings = new HashSet<>();

        for (String str : stringArray) {
            if (!uniqueStrings.add(str)) {
                duplicateStrings.add(str);
            }
        }

        System.out.println("Duplicate strings:");
        for (String duplicate : duplicateStrings) {
            System.out.println(duplicate);
        }
    }
}


