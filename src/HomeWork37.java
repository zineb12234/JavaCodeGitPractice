import java.util.HashSet;
import java.util.Set;

public class HomeWork37 {

    public static void main(String[] args) {
            String[] stringArray = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

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

