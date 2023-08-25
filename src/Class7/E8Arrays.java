package Class7;

public class E8Arrays {
    public static void main(String[] args) {
        // only creating the array
        int[] number = {20, 10, 50, 30, 40};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
            System.out.println(sum);
        }
    }
