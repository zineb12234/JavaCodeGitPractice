package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.print("please enter your name");
        // creating the object of the scanner class so that we can reuse the logic from
        //this class which already written from java developer
        Scanner input=new Scanner(System.in);
        //taking an input from the user and storing in int a name variables
        String name = input.next();
        if (name.equals("amal")){
            System.out.println("java instructor");
        }else {
            System.out.println("i don't you?");
        }
        //System.out.println("hello"+);
    }


    }