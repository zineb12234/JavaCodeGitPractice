package Class8;

public class E12EnHancedLoop {
    public static void main(String[] args) {
        for (int i=0; i<10 ;i++) {
            System.out.println("Batch 17 is Greatest of all time");
            if (i%2==0){
                continue; //skip
            }
            System.out.println("I was kidding");
        }
    }
    }