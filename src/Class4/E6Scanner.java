package Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter your full name");
        String name=scanner.next();
        if(name.equals("jamel")) {
            System.out.println("senior SDETin 2 years");
        }else if(name.equals("ayesha")){
            System.out.println("she lives in Canada");
        }else if(name.equals("Rkia")){
            System.out.println("always sleepy");
        }else if(name.equals("Rabab")) {
            System.out.println("working in the weekend");
        }else if(name.equals("wardiya")){
            System.out.println("party time");
        }
    }
}