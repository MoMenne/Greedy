

import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class CoinCalculatorTest {

//    @Test
//    public void amountOfCoinsReturned() {
//        CoinCalculator coinCalculator = new CoinCalculator();
//
//        String coinMessage = coinCalculator.changeBack("$18.69");
//
//        assertEquals("26", coinMessage);
//    }
    @Test
    public void noChangeMeansNoCoins() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.changeBack("$0.00");

        assertEquals("you gave me no money, I'm not a fucking bank!", coinMessage);
    }
}
