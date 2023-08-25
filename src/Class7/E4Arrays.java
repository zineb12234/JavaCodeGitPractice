package Class7;

public class E4Arrays {
    public static void main(String[] args) {
        // creating the array and initializing the array
        String [] fruit={"Banana","Orange","Kiwi","Apple","PineApple"};
        fruit[3]="Mango";
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}