
public class ShowMeTheMoney {

    private  ShowMeTheMoney() {}

    private static ShowMeTheMoney showMeTheMoney;

    public static ShowMeTheMoney getInstance() {
        if (showMeTheMoney == null) {
            showMeTheMoney = new ShowMeTheMoney();
        }
        return showMeTheMoney;
    }

    public  CoinCalculator usChangeBack() {
        return new CoinCalculator();
    }

    public  CoinCalculator euroChangeBack() {
        return new CoinCalculator();
    }

//  add other currency methots here.
}
