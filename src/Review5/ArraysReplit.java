package Review5;

import java.util.Scanner;

public class ArraysReplit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i =0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" ");
        }
        for (int i=numbers.length-1;i>=0;i++) {
            if (numbers[i]%2==0) {
                System.out.println(numbers[i]+" ");
            }
        }
    }
}

