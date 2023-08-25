package LgicalOperator1;

public class LogicalOperator05 {
    public static void main(String[] args) {
        String genre="thriller";
        if(genre.equals("thriller")||genre.equals("HORROR")||genre.equals("sci fl")){
            System.out.println("im going to watch the movie");
        }else {
            System.out.println("i don't like the genre");
        }
    }
}



    // if all the conditon false then we will get false but if any one of the conditon is true bthe system will print ouy true  