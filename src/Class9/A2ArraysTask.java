package Class9;

public class A2ArraysTask {
    public static void main(String[] args) {
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