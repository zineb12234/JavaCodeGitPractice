package Class9;

public class A1ArraysTask {
    public static void main(String[] args) {
        String[][] store =
                {
                        {"Tomato", "Potato", "Onion", "Pumpkin"},
                        {"Apple", "Kiwi", "Watermelon", "Orange"},
                        {"Milk", "Butter", "Cheese", "Sour Cream"},
                        {"Cake", "Candy", "Apple Pie", "Ice Cream"},
                };
        for (String[] row : store) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("=============");
        for (int i = 0; i < store[1].length; i++) {
            for (int j = 0; j < store[i].length; j++) {
                System.out.print(store[i][j] + " ");
            }
            System.out.println();
        }
    }
}

