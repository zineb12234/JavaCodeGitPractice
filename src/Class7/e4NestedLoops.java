package Class7;

public class e4NestedLoops {
    public static void main(String[] args) {
      /*  int y=1;
        while (y <= 4) {
            int x = 1;
            while (x <= 6) {
                    System.out.print(x + " ");
                    x++;
                }
                System.out.println();
                y++; */
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 7; j++) {
                if (j != 3) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    }