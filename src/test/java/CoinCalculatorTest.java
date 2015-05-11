

import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class USCoinCalculatorTest {

    @Test
    public void amountOfEuroCoinsReturned() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.euroChangeBack("$19.68");

        assertEquals("15", coinMessage);
    }

    @Test
    public void amountOfUSCoinsReturned() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.usChangeBack("$18.69");

        assertEquals("25", coinMessage);
    }
    @Test
    public void noChangeMeansNoCoins() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.usChangeBack("$0.00");

        assertEquals("you gave me no money, I'm not a fucking bank!", coinMessage);
    }
}
