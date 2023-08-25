package Review02;

import java.util.Scanner;

public class ReviewTask05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your FullName");
        String fName=scanner.next();
        System.out.println("Please Enter your City");
        scanner.nextLine();
        String city= scanner.nextLine();
        System.out.println(fName+" "+city);

    }
}