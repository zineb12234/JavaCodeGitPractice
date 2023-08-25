package Review3;

import java.util.Scanner;

public class taskNum1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please entre the first boolean  value of true/false");
        boolean vae1=scanner.nextBoolean();
        System.out.println("please entre the second boolean  value of true/false");
        boolean var2= scanner.nextBoolean();

        if (vae1&&var2){
            System.out.println("both value are true");
        }else {
            System.out.println("both value are not true");
        }
    }
}
