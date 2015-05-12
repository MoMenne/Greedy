import java.util.Arrays;

public class Greedy {

    public static void main(String[] varArgs) {

        System.out.println(Arrays.toString(varArgs));
        System.out.println("varArgs lenght " + varArgs.length);

        if (varArgs.length >= 1) {
            CoinCalculator usChange = ChangeCalculator.getInstance().usChangeReturned();
            usChange.usChangeBack(varArgs[0]);
            System.out.println(usChange);
    }
        throw new IllegalArgumentException("No value given");
    }
}
