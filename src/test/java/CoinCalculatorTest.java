
/**
 * Created by Brian on 5/7/2015.
 */
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class CoinCalculatorTest {

    @Test
    public void noChangeMeansNoCoins() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack("$8.00");

        assertEquals("you get no coins back", coinMessage);
    }

    @Test
    public void oneCentMeansOnePenny() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack("$8.01");

        assertEquals("you get one penny back", coinMessage);
    }

    @Test
    public void fiveCentsMeansOneNickel() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack("$8.05");

        assertEquals("you get one nickel back", coinMessage);
    }
}