package Class8;

public class E8EnHancedLoop {
    public static void main(String[] args) {

        int[] nums = {12, 34, 56, 76, 43, -10, -5, 99};

        int smallestValue = 0;
        for (int n : nums) {
            if (n < smallestValue) {
                smallestValue = n;

                System.out.println(smallestValue);
            }
        }
    }
        }