package Class3;

public class TempearatureCheck {
    public static void main(String[] args) {
        double temperature =25;
        if (temperature < 32) {
            System.out.println("water will freeze with temperature  "+temperature);
        } else {
            System.out.println("water will NOT freeze with temperature "+temperature);
        }
    }
}
// whenever the answer of the condition is true java will print "if" part
// if the answer is false the java will print  "else"
