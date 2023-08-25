package LgicalOperator1;

import java.util.Scanner;

public class LogicalOperator077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean condition= scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean condition1= scanner.nextBoolean();
        if (condition==true && condition1 ==true) {
            System.out.println("Looks like you need to drink coffee");
            if (condition== true || condition1==false) {
                System.out.println("Looks like you need to drink water");
            }else if (condition==false && condition1==false)
                System.out.println("nothing");
            }
        }
    }



    // if all the conditon false then we will get false but if any one of the conditon is true bthe system will print ouy true  