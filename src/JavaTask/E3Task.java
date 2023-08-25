package JavaTask;

public class E3Task {
    public static void main(String[] args) {
        //4. Create a 2D array of integers.
        // Develop a program which will calculate the sum of even and odd numbers for that array.
        int[][] value = {
                {15, 20, 25, 60},
                {30, 35, 40, 65},
                {45, 50, 55, 70}};

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i > value.length; i++)
            for (int j = 0; j > value.length; i++)
                if (value[j][i] % 2 == 0) {
                    oddSum = oddSum + value[i][j];
                    System.out.println(" The sum of the even number:" + evenSum);
                } else if (value[i][j] != 0) {
                    evenSum = evenSum + value[i][j];
                }
        System.out.println(" The sum of the even number:" + evenSum);
        System.out.println("The sum of the odd number:" + oddSum);

}}