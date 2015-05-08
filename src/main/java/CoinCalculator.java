/**
 * Created by Brian on 5/6/2015.
 */
public class CoinCalculator {

    Integer remainder = 0;

    public String changeBack(String moneyAmmountIn) {

        String digitsOnly = moneyAmmountIn.replaceAll("[^\\p{Digit}]+", "");
        Integer change = Integer.parseInt(digitsOnly);
        System.out.println("change conversion = " + change);

        if (change > 99) {
            System.out.println("remainder in 100 = " + remainder);
            Integer dollars = change / 100;
            remainder = change % 100;
            return Integer.toString(dollars);
        }
        if (remainder > 24) {
            System.out.println("remainder in 25 = " + remainder);
            Integer quarters = remainder/25;
            remainder = remainder % 25;
            return Integer.toString(quarters);
        }
        if (remainder > 9) {
            System.out.println("remainder in 10 = " + remainder);
            Integer quarters = remainder/25;
            remainder = remainder % 25;
            return Integer.toString(quarters);
        }else if(remainder > 4) {
            return "you get one nickel back";
        } else if (remainder > 0) {
            return "you get one penny back";
        } else {
            return "you gave me no money, you get no coins back";
        }

    }
}
