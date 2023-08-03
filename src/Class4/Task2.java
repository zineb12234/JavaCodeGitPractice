package Class4;

public class Task2 {
    public static void main(String[] args) {
        double mortgageRte =4.1;
        double housePrice = 40000;
        if (mortgageRte>4.5) {
            System.out.println("will not buy a house!");
        } else {
            System.out.println(" will consider buy a house");

            if (housePrice > 40000) {
                System.out.println("will take a loan");

            } else {
                System.out.println(" will pay cash.");
            }
        }
    }
}
