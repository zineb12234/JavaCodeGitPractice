package Class8;

public class E6EnHancedLoop {
    public static void main(String[] args) {

        int[] nums = {12, 34, 56, 76, 43,60, 10,9,15,19};

        for (int j:nums) {
            if (j%2==0) {

                System.out.println(j);
            }
        }
    }
}