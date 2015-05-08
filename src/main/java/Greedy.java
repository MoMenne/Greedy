/**
 * Created by Brian on 5/6/2015.
 */
public class Greedy {

    public static void main(String[] varArgs) {
        if (varArgs.length > 1) {
            CoinCalculator coinCalculator = new CoinCalculator();
            coinCalculator.changeBack(varArgs[0]);
        }
        throw new IllegalArgumentException("No value given");
    }
}
