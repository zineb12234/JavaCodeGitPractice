package Class9;

import java.util.Arrays;

public class A11Arrays {
    public static void main(String[] args) {
        String [][] names=
                {       {"Amal", "Mohamed", "Ahmed", "Ali"},
                        {"Zineb", "Rabab", "Rkia", "Mama"},
                        {"John", "Bob", "Patrik", "Nour"},
                        {"Fatima", "Mouna", "Aicha", "Adam"},
                };
       for (String [] row:names) {
           for (String V : row) {
               System.out.print(V + " ");
           }
           System.out.println();
       }
        System.out.println(Arrays.deepToString(names)+" ");
    }
}

