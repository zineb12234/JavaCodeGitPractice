package Class9;

public class A2Arrays {
    public static void main(String[] args) {
        String [][] names=
                {       {"Amal", "Mohamed", "Ahmed", "Ali"},
                        {"Zineb", "Rabab", "Rkia", "Mama"},
                        {"John", "Bob", "Patrik", "Nour"},
                        {"Fatima", "Mouna", "Aicha", "Adam"},
                };
        String [] row= names[2];
        //System.out.println(row[3]);
       // System.out.println(Arrays.toString(firstRow));
for (String name:row){
    System.out.println(name);
}
    }
}
