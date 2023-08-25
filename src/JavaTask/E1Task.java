package JavaTask;

public class E1Task {
    public static void main(String[] args) {
       // 2. Create an array of integer values.
        //After the array is created, calculate the sum of all stored elements in that array.
        int[][] numbers = {
                {15, 20, 25},
                {30, 35, 40},
                {45, 50, 55}};

        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum = sum + numbers[row][col]; //addition methode
            }
        }
        System.out.println(sum);

    }



}