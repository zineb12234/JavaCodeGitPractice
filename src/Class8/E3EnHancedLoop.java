package Class8;

public class E3EnHancedLoop {
    public static void main(String[] args) {

        int[] nums = {12, 34, 56, 76, 43, 10};
        int count=0;
        for (int T:nums) {
            if (T>30) {
                count++;
            }
        }
                System.out.println(count);
            }

}
