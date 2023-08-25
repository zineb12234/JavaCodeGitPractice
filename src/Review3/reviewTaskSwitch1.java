package Review3;

import java.util.Scanner;

public class reviewTaskSwitch1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please entre the name of the fruit");
        String fruit=scanner.next();
        switch (fruit){
            case "orange":
                System.out.println("it's usually orange");
                break;
            case "banana":
                System.out.println("yellow banana are good");
                break;
            case "Strawberry":
                System.out.println("i like red strawberry");
                break;
            case "blue berry":
                System.out.println("blue berries are very good for heart");
                break;
            default:
                System.out.println("i don't lik this fruit");
        }

    }
}
