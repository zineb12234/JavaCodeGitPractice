package Review02;

import java.util.Scanner;

public class reviewTask2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please entre the price of the item");
        double price=scanner.nextDouble();
        if (price>10000){
            System.out.println("i can't buy this item");
        } else{
            System.out.println("lets buy it");
            
        }
    }
}
