package Class8;

public class E2ArrayNum {
    public static void main(String[] args) {
        int[] number = {10, 20, 4, 3, 8, 45, 96};
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 10) {

                count++;
            }
        }

                System.out.println(count);
        }
    }
