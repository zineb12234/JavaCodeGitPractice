package Class7;

public class TaskArray6 {
    public static void main(String[] args) {
        //Create an array of animals and store 5 elements into it.
        // Using 2 different loops print all elements from the array.

        String[] animals= {"Cat", "Dog", "horse", "lion", "elephant", "tiger"};
        for (int i = 0; i <6; i++) {
            System.out.print(animals[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i <6) {
            System.out.print(animals[i] + " ");
            i++;
        }
    }
}