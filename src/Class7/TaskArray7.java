package Class7;

public class TaskArray7 {
    public static void main(String[] args) {
        //Create an array on integers and calculate the sum of all elements in an array

        int [] value={5,20,30,45,60}; //160
        int sum=0;
        for (int i=0; i<value.length;i++){
            sum=sum+value[i];
        }
        System.out.println(sum);
        }
    }
