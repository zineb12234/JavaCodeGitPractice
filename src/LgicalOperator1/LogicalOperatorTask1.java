package LgicalOperator1;

import java.util.Scanner;

public class LogicalOperatorTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("please entre your height");
                double height = scanner.nextDouble();
    if (height<60) {
                 System.out.println("short");
    }else if (height>=60 || height<=72) {
                System.out.println("medium");
    } else {
                System.out.println("tall");
            }
        }
    }



    // if all the conditon false then we will get false but if any one of the conditon is true bthe system will print ouy true  