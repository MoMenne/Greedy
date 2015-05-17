import java.util.Arrays;

public class Greedy {

    public final static String EURO = "\u20ac";
    public static String coinsGiven;

    public static void main(String[] varArgs) {

        if (varArgs.length >= 1) {
            coinsGiven = varArgs[0];
            Greedy greedy1 = new Greedy(ChangeCalculator.getInstance());

        }else {
            throw new IllegalArgumentException("No value given");
        }
    }

    private  ChangeCalculator changeCalculator;

    public Greedy(ChangeCalculator changeCalculator) {
        this.changeCalculator = changeCalculator;
    }

    public void start() {
        if (coinsGiven.contains("$")) {
            UsCoinCalculator usChange = changeCalculator.usChangeReturned();
            usChange.changeBack(coinsGiven);
            System.out.println(usChange);
        }

        if (coinsGiven.contains(EURO)) {
            EuroCoinCalculator euroChange = ChangeCalculator.getInstance().euroChangeReturned();
            euroChange.changeBack(EURO);
            System.out.println(euroChange);
        }
    }
}
