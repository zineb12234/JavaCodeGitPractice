package Review02;

import java.util.Scanner;

public class reviewTask3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=20;
        if(age==60){
            System.out.println(" you get 20% discount ");
        }
        if(age==50){
            System.out.println(" you get 15% discount ");
        }
        if (age==40){
            System.out.println(" you get 10% discount ");
        }
        else {
            System.out.println("No discount for you");
        }
    }
}
