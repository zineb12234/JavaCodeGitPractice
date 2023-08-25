package Class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your gender F=female M=male");
        char gender = scanner.next().charAt(0);
        System.out.println("your gender is" + gender);

        char gender1= scanner.next().charAt(0);
    }
}