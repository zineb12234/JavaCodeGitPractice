package Class4;

public class Er1NestedElse {
    public static void main(String[] args) {
      double accountBalance=70000;
      if (accountBalance>32000){
          System.out.println("we can afford a normal toyota");
          if (accountBalance>50000){
              System.out.println("we can buy a luxury car ");
          }
      }else {
          System.out.println("we need to save more money");
      }
    }
}
