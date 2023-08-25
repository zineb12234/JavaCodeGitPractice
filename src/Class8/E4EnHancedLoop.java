package Class8;

public class E4EnHancedLoop {
    public static void main(String[] args) {

        int[] nums = {12, 34, 56, 76, 43, 10};

        int largestValue=0;
      for(int n:nums){
          if(n>largestValue){
              largestValue=n;
          }

        }
                System.out.println(largestValue);
            }

}
