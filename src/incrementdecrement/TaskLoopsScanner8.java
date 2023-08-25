package incrementdecrement;

import java.util.Scanner;

public class TaskLoopsScanner8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("please entre a number or -1 to terminate ");
            input = scanner.nextInt();
            System.out.println("you have entered " + input);
        }while (input!=-1);
    }
}