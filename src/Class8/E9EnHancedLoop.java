package Class8;

public class E9EnHancedLoop {
    public static void main(String[] args) {

        int[] nums = {12, 34, 56, 76, 43, -10, -5};
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0){
                nums[i]=0;
            }
        }
        for (int num:nums){
            System.out.println(num);
        }
    }
        }