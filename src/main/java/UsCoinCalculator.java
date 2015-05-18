import java.util.ArrayList;

/**
 * Created by Brian on 5/17/2015.
 */
public class UsCoinCalculator {

    ArrayList<String> finalArray = new ArrayList<String>();

    public String changeBack(String moneyAmmountIn) {

        String digitsOnly = moneyAmmountIn.replaceAll("[^\\p{Digit}]+", "");
        Integer change = Integer.parseInt(digitsOnly);

        int totalCoins = 0;

        if (change <= 0) {
            finalArray.add("you gave me no money, NO CHANGE FOR YOU!!!");
            return toString();
        }

        finalArray.add("Thank you, here is your change:\n");

        int dollars = change / 100;
        totalCoins += dollars;
        change = change % 100;
        if (dollars > 0) {
            finalArray.add(dollars + ((dollars > 1) ? " dollar coins." : " dollar coin."));
        }

        int fiftyCentPiece = change / 50;
        totalCoins += fiftyCentPiece;
        change = change % 50;
        if (fiftyCentPiece > 0) {
            finalArray.add(fiftyCentPiece + ((fiftyCentPiece > 1) ? " fifty cent pieces." : " fifty cent piece."));
        }

        int quarters = change / 25;
        totalCoins += quarters;
        change = change % 25;
        if (quarters > 0) {
            finalArray.add(quarters + ((quarters > 1) ? " quarters." : " quarter."));
        }

        int dimes = change / 10;
        totalCoins += dimes;
        change = change % 10;
        if (dimes > 0) {
            finalArray.add(dimes + ((dimes > 1) ? " dimes." : " dime."));
        }

        int nickles = change / 5;
        totalCoins += nickles;
        change = change % 5;
        if (nickles > 0) {
            finalArray.add(nickles + ((nickles > 1) ? " nickles." : " nickle."));
        }

        int pennys = change;
        totalCoins += pennys;
        if (pennys > 0) {
            finalArray.add(pennys + ((pennys > 1) ? " pennys." : " penny."));
        }
        finalArray.add("\n" + totalCoins + ((totalCoins > 1) ? " coins?" : " coin?") + ", I am allowed to accept tips.");

        return null;
    }

    @Override
    public String toString() {

        String coinPrintOut = null;
        StringBuilder build = new StringBuilder();
        for (String z : finalArray) {
//            System.out.println(z);
            build.append(z);
            build.append("\n");
            coinPrintOut = build.toString();
        }
        return coinPrintOut;
    }
}