package Class9;

public class A4ArraysTask {
    public static void main(String[] args) {
        String[][] countries =
                {
                        {"USA", "Canada", "Mexico", "Panama"},
                        {"Brazil", "Argentina", "Colombia", "Ecuador"},
                        {"Germany", "Italy", "Greece", "UK"},
                        {"China", "India", "Japan", "Singapore"},
                };
        for (String[] row : countries) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("******************");
        for (int i = 0; i < countries[1].length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j< countries[i].length; j++) {
                sum=(countries[i].length* countries[j].length);

            }

        }
        System.out.println(sum);

    }
}

