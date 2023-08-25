package LgicalOperator1;

import java.util.Scanner;

public class LogicalOperatorTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("entre His/Hers birth month");
        String month=scanner.next();
        if(month.equals("march")||month.equals("april")||month.equals("may")) {
            System.out.println("spring");
        }if (month.equals("jun")||month.equals("jul")||month.equals("aug")){
            System.out.println("summer");
        }else {
            System.out.println("you were born in winter");
        }
    }
}



    // if all the conditon false then we will get false but if any one of the conditon is true bthe system will print ouy true  