package LgicalOperator1;

public class LogicalOperator04 {
    public static void main(String[] args) {
        boolean broughtFlowers = false;
        boolean broughtChocolates =false;
        boolean allMyMistake =true;
        if (broughtFlowers || broughtChocolates || allMyMistake) {
            System.out.println("wife is happy");
        } else {
            System.out.println("wife is sad");
        }
    }
}



    // if all the conditon false then we will get false but if any one of the conditon is true bthe system will print ouy true  