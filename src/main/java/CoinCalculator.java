
import java.util.ArrayList;

class CoinCalculator {


    public String changeBack(String moneyAmmountIn) {

        String digitsOnly = moneyAmmountIn.replaceAll("[^\\p{Digit}]+", "");
        Integer change = Integer.parseInt(digitsOnly);

        int totalCoins = 0;

        if (change == 0)
            return "you gave me no money, I'm not a fucking bank!";

        System.out.println("Here is your change:\n");

        int dollars = change / 100;
        totalCoins += dollars;
        change = change % 100;
        if (dollars > 0) {
            System.out.println(dollars + ((dollars > 1) ? " dollar coins.":" dollar coin."));
        }

        int fiftyCentPiece = change / 50;
        totalCoins += fiftyCentPiece;
        change = change % 50;
        if (fiftyCentPiece > 0) {
            System.out.println(fiftyCentPiece + ((fiftyCentPiece > 1) ? " fifty cent pieces.":" fifty cent piece."));
        }

        int quarters = change / 25;
        totalCoins += quarters;
        change = change % 25;
        if (quarters > 0) {
            System.out.println(quarters + ((quarters > 1) ? " quarters." : " quarter."));
        }

        int dimes = change / 10;
        totalCoins += dimes;
        change = change % 10;
        if (dimes > 0) {
            System.out.println(dimes + ((dimes > 1) ? " dimes." : " dime."));
        }

        int nickles = change / 5;
        totalCoins += nickles;
        change = change % 5;
        if (nickles > 0) {
            System.out.println(nickles + ((nickles > 1) ? " nickles." : " nickle."));
        }

        int pennys = change;
        totalCoins += pennys;
        if (pennys > 0) {
            System.out.println(pennys + ((pennys > 1) ? " pennys." : " penny."));
        }
        System.out.println("\n" + totalCoins + ((totalCoins > 1) ? " coins?" : " coin?") + ", I am allowed to accept tips.");

        return Integer.toString(totalCoins);
    }
}
