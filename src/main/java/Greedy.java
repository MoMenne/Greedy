import java.util.Arrays;

public class Greedy {

    public final static String EURO = "\u20ac";

    public static void main(String[] varArgs) {

        if (varArgs.length >= 1) {
            if (varArgs[0].contains("$")) {
            CoinCalculator usChange = ChangeCalculator.getInstance().usChangeReturned();
            usChange.usChangeBack(varArgs[0]);
            System.out.println(usChange);
            }

            if (varArgs[0].contains(EURO)) {
                CoinCalculator euroChange = ChangeCalculator.getInstance().euroChangeReturned();
                euroChange.euroChangeBack(varArgs[0]);
                System.out.println(euroChange);
            }

        }else {
            throw new IllegalArgumentException("No value given");
        }
    }
}
