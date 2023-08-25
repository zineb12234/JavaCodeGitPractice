package LgicalOperator1;

import java.util.Scanner;

public class LogicalOperator088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println("Please enter two numbers");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
       if (value1 == value2 && word1.equals(word2)) {
           System.out.println("AND");
       }if (value1 == value2|| word1!=word2) {
                System.out.println("OR");
            } else{
            if (value1 != value2 && word1 != word2) {
                    System.out.println("NONE");
                }
            }
        }
    }



    // if all the conditon false then we will get false but if any one of the conditon is true bthe system will print ouy true  