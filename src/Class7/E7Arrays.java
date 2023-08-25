package Class7;

public class E7Arrays {
    public static void main(String[] args) {
        // only creating the array
        int [] number={20,10,50,30,40,7,3,};
        for (int i = 0; i < number.length; i++) {
            if (number[i]%2==0) {
                //(number[i]%2!=0) we use this way to print the even number
                System.out.println(number[i]);
            }
        }
    }
}