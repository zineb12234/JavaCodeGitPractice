package JavaTask;

public class E6Task {
    //9. Write a java program to find the 2 largest number in the array?
    public static void main(String[] args) {
        //9. Write a java program to find the
        // 2 largest number in the array?
        int[] num = {19, 21, 7, 81, 18, 90, 10};
            int highest = num[0];
            int secondLargest=num[0];
            for (int i = 0; i < num.length; i++) {
                if (num[i] > highest) {
                    secondLargest=highest;
                    highest  = num[i];
                }
                if (num[i]<highest && num[i]>secondLargest){
                    secondLargest=num[i];
                }
            }System.out.println(secondLargest);
        }
    }


