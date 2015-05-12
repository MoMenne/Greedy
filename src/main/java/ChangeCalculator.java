
public class ChangeCalculator {

    private ChangeCalculator () {}

    private static ChangeCalculator changeCalculator;

    public static ChangeCalculator getInstance() {
        if (changeCalculator == null) {
            changeCalculator = new ChangeCalculator();
        }
        return changeCalculator;

    }

    public static CoinCalculator usChangeReturned() {
        return new CoinCalculator();
    }

    public static CoinCalculator euroChangeReturned() {
        return new CoinCalculator();
    }

    // Other types of obstacles ie: lakes, walls, trees....shit like that.


}
