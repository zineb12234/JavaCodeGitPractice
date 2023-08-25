package Review3;

public class reviewTask1 {
    public static void main(String[] args) {
        boolean isMeat=true;
        boolean isEgg=false;
        boolean isFish=true;
        boolean milk=false;
        boolean vegetables=true;


        boolean isProtein=isEgg||isFish||isMeat;
        boolean isGoodDiet=(isEgg||isMeat||isFish) &&milk&&vegetables;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);
    }
}
