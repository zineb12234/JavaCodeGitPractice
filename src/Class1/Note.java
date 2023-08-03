package Class1;

public class Note {
    public static void main(String[] args) {
        // byte->short->int->long->float->double
        long age=12;

        //int myAge=age;
        byte number=10;
        int number2=number;
        System.out.println(number2);
        float num=15.6f; // int not taking the decimal number
        int num2;

        //num2=(int)num1; // converting the data type(type casting) narrowing /explicit(/implicit +increase) /manual
        // it takes the decimal away
       // System.out.println(num2);

int box1=2000;
int box2=box1; // implicit /auto
        System.out.println(box2);



    }
}
