package Review5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entre the size of the arrays");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Please entre the number ");
            numbers[i]=scanner.nextInt();

        }
        System.out.println("You entered these numbers");
        System.out.println(Arrays.toString(numbers));
    }
}


