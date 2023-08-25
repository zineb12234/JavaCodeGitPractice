package Class9;

public class A8Arrays {
    public static void main(String[] args) {
        String[][] student = {
                {"ali", "Aicha", "Ahmed", "merry"},
                {"A", "B", "C", "D"},
        };
        for (int i = 0; i < student[0].length; i++) {
            if (student[1][i].equals("A") || student[1][i].equals("B")) {
                System.out.println(student[0][i]);
            }
        }
    }
}

