package LgicalOperator1;

public class LogicalOperator07 {
    public static void main(String[] args) {
        boolean goodCredit=false;
        boolean stableJob=true;
        boolean minimumAge=true;
     if (goodCredit&&stableJob&&minimumAge){
        System.out.println("you can have a loan");
    }else {
         System.out.println("you need to fulfill all the requirement");
     }

    }
}

    // if all the conditon false then we will get false but if any one of the conditon is true bthe system will print ouy true  