package Class9;

public class A9Arrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {15, 25, 35, 45}};
        for (int i = 0; i < numbers.length; i++) {
            for (int col = 0; col < numbers[i].length; col++) {
            System.out.print(numbers[i][col]+" ");
            
        }
            System.out.println();
        }
    }
}

