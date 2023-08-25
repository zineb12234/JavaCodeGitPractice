package LgicalOperator1;

import java.util.Scanner;

public class E10Switch2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Entre you country");
        String country= scanner.nextLine();
        country=country.toLowerCase();
        switch (country){
            case ("usa"):
                System.out.println("english");
                break;
            case ("morocco"):
                System.out.println("arabic");
                break;
            case ("turkey"):
                System.out.println("turkish");
                break;
            case ("spain"):
                System.out.println("spanish");
                break;
            case ("china"):
                System.out.println("chinese");
                break;
            case ("nepal"):
                System.out.println("nepali");
                break;
            default:
                System.out.println("i don't speak your language");
        }
    }
}
