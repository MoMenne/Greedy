
public class ChangeCalculator {

    private ChangeCalculator () {}

    private static ChangeCalculator changeCalculator;

    public static ChangeCalculator getInstance() {
        if (changeCalculator == null) {
            changeCalculator = new ChangeCalculator();
        }
        return changeCalculator;
    }

    public  UsCoinCalculator usChangeReturned() {
        return new UsCoinCalculator();
    }

    public  EuroCoinCalculator euroChangeReturned() {
        return new EuroCoinCalculator();
    }

    // Other types of coins can be .


}
