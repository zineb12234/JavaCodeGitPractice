package Class9;

public class A12Arrays {
    public static void main(String[] args) {
        String[][] cars = {
                {"Ford", "Dodge", "Tesla"},
                {"BMD","Audi","mercedes"},
                {"Lambo","maserati","Ferrari"},
                {"Kia","hyundai","KG Mobility"}
        };
        for (String [] row:cars) {
            for (String V : row) {
                System.out.print(V + " ");
            }
            System.out.println();
        }
    }
}

