
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class CoinCalculatorTest {

    String money = "$8.42";

    @Test
    public void noChangeMeansNoCoins() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack("$8.42");

        assertEquals("you gave me no money, you get no coins back", coinMessage);
    }

    @Test
    public void oneCentMeansOnePenny() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack(money);

        assertEquals("2", coinMessage);
    }

    @Test
    public void fiveCentMeansOneNickel() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack(money);

        assertEquals("1", coinMessage);
    }
    @Test
    public void tenCentsMeansOneDime() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack(money);

        assertEquals("2", coinMessage);
    }

    @Test
    public void twentyfiveCentsMeansOneQuarter() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack(money);

        assertEquals("1", coinMessage);
    }

    @Test
    public void oneHundredCentsMeansOneDollar() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack("$8.42");

        assertEquals("8", coinMessage);
    }
}