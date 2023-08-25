package Class8;

import java.util.Scanner;

public class E11EnHancedLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double total=0;
        while (true){
            System.out.println("Please Enter The price of the item or -1 to terminate");
            double price=scanner.nextDouble();
            if (price==-1){
                break;
            }else{
                total=total+price;
            }
            System.out.println("your total bill is "+total);
        }
    }
    }