package Class9;

public class A13Arrays {
    public static void main(String[] args) {
        String[][] names =
                {
                        {"Jeep", "Ford", "Cadillac", "Dodge"},
                        {"Audi", "BMW", "Porsche", "Volkswagen"},
                        {"kia", "Hyundai", "Genesis", "Pronto"},
                        {"Lamborghini", "Ferrari", "Maserati", "Alfa"},
                };
        for (String[] row : names) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println("=========================");

            for (int i = 0; i < names[1].length; i++) {
                for (int j = 0; j < names[i].length; j++) {

            }
                System.out.println();
            }

        }
    }
    }
