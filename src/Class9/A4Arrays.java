package Class9;

public class A4Arrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {15, 25, 35, 45}};
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                if (numbers[row][col] %2 == 0) {   // print out even numbers methode
                    //  if (numbers[row][col] != 0) {  print out odd numbers methode
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();
        }
        }

    }
