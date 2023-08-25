package JavaTask;

public class E5Task {
    //8. Maximum and minimum number in the array?
    public static void main(String[] args) {
        int[] num = {890, 721, 770, 801, 186, 90, 100};
        int min = num[0];
        int max = num[0];
        for (int n : num)
            if (n < min) {
                min = n;
            } else if (n > max) {
                max = n;
            }

        System.out.println( max );
        System.out.println(min );
    }
}
