package incrementdecrement;

import java.util.Scanner;

public class TaskLoops5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please entre the starting point ");
        int start=scanner.nextInt();
        System.out.println("please entre the ending point");
        int end=scanner.nextInt();
        System.out.println("please entre the step us well");
        int step=scanner.nextInt();
        while (start <= end) {
            System.out.print(start+" ");
            start+=step;
        }

    }
}
