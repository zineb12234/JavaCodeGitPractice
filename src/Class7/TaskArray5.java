package Class7;

public class TaskArray5 {
    public static void main(String[] args) {
        //Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.

        String[] cars = {"Toyota", "Honda", "Ford", "Ferrari", "Porch", "Audi"};
        for (int i = 0; i <6; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i <6) {
            System.out.print(cars[i] + " ");
            i++;
        }
    }
}