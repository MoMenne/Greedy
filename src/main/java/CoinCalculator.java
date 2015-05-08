/**
 * Created by Brian on 5/6/2015.
 */
public class CoinCalculator {


    public String changeBack(String coinBack) {
        Integer change = Integer.parseInt(coinBack.charAt(coinBack.length() - 1) + "");
        if(change > 4) && (change <10) {
            return "you get one nickel back";
        } else if (change > 0) {
            return "you get one penny back";
        } else {
            return "you get no coins back";
        }
    }
}
