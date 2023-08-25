package Class8;

public class E7EnHancedLoop {
    public static void main(String[] args) {

        int[] nums = {12, 37, 53, 71, 43,60, 10,9,15,19};
        int largest=nums[0];
        for (int d:nums) {
            if (d>largest && d%2==0) {
               largest=d;

                System.out.println(largest);
            }
        }
    }
}