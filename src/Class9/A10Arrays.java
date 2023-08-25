package Class9;

public class A10Arrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {15, 25, 35, 45}};
       for (int [] row:numbers){
           for( int col:row){
               System.out.print(col +" ");
           }
           System.out.println();
       }
    }
}

