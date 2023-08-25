package JavaTask;

public class E2Task {
    public static void main(String[] args) {
        //3. Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int[][] value = {
                {15, 20, 25, 60},
                {30, 35, 40, 65},
                {45, 50, 55, 70}};

        int sum = 0;
        for (int row = 0; row < value.length; row++) {
            for (int col = 0; col < value[row].length; col++) {
                if (value[row][col] % 2 == 0) {
                    System.out.print(value[row][col]+" ");
                }

            }
            System.out.println();
        }
    }
}