package Review6;

public class R1Task {
    public static void main(String[] args) {
        int a =10;
        int [] array={10, 11, 12, 13, 55, 67 ,34};
        int numberOfElements= array.length;
        System.out.println(numberOfElements);// print out the total of the element in the array
        System.out.println(array[3]+" "); // getting one element from the array

        /* when to use the loops - when we want to repeat a block of code
        when we do not know the exact number of iterations -while or do while
        when we know how many times we want to repeat or iterate the code -fo loop
        we use enhanced for loop ONLY with the arrays or colections
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i] + " ");
        }
            /* enhanced for loop syntax
            for (DataTypeOfElement anyVariable name :Nameof the DataStructure ){
             */
// int [] array={10, 11, 12, 13, 55, 67 ,34};
        for (int ar:array){
            System.out.print(ar);
        }
    }
}
