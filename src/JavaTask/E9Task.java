package JavaTask;

public class E9Task {
    //9. Write a java program to find the 2 largest number in the array?
    public static void main(String[] args) {
        String[] animal = {"Cat", "Dog", "Lion", "Phone", "Cat", "Lion", "Elephant"};

        for (int i = 0; i < animal.length; i++) {
            for (int j = i+1; j < animal.length; j++) {
                if(animal[i].equalsIgnoreCase(animal[j])){

                    System.out.println(animal[j]);
                }

            }

        }

    }
}


