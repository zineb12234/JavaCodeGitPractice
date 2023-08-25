package LgicalOperator1;


import java.util.Scanner;

class Main {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter first number");
            int number1=scanner.nextInt();
            System.out.println("Please enter second number");
            int number2=scanner.nextInt();

            if(number1*number2<=-1){
                System.out.println("false");

            }else if(number1*number2>=1){
                System.out.println("true");
            }
        }
}
