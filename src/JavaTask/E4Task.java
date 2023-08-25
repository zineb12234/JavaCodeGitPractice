package JavaTask;

public class E4Task {
    //1. Create a program that uses an array
    // to store a list of temperatures for a week, and then
    // uses a loop to find the highest and lowest temperature for the week.
    public static void main(String[] args) {
        int[] temperature = {89, 72, 77, 80, 86, 90, 100};
        int min = temperature[0];
        int max = temperature[0];
        for (int n : temperature)
            if (n < min) {
                min = n;
            } else if (n > max) {
                max = n;
            }

        System.out.println("the highest temperature " + max +"°F");
        System.out.println("the lowest temperature " + min +"°F");
    }
}
