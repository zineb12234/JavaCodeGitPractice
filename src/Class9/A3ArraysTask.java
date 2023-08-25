package Class9;

public class A3ArraysTask {
    public static void main(String[] args) {
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