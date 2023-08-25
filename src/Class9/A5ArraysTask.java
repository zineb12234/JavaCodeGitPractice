package Class9;

public class A5ArraysTask {
    public static void main(String[] args) {
        String[][] countries =
                {
                        {"USA", "Canada", "Mexico", "Panama"},
                        {"Brazil", "Argentina", "Colombia", "Ecuador"},
                        {"Germany", "Italy", "Greece", "UK"},
                        {"China", "India", "Japan", "Singapore"},
                };
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j< countries[i].length; j++) {
               sum=(countries[i].length* countries[j].length);

            }

        }
        System.out.println(sum);
    }
}

