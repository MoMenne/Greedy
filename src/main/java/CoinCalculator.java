


import java.util.ArrayList;

class CoinCalculator {

    ArrayList<String> finalArray = new ArrayList<String>();

    public String usChangeBack(String moneyAmmountIn) {

        String digitsOnly = moneyAmmountIn.replaceAll("[^\\p{Digit}]+", "");
        Integer change = Integer.parseInt(digitsOnly);

        int totalCoins = 0;

        if (change<= 0) {
            finalArray.add( "you gave me no money, NO CHANGE FOR YOU!!!");
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

    public String euroChangeBack(String moneyAmmountIn) {

        String digitsOnly = moneyAmmountIn.replaceAll("[^\\p{Digit}]+", "");
        Integer change = Integer.parseInt(digitsOnly);

        int totalCoins = 0;

        if (change <= 0) {
            finalArray.add("vous me donniez pas d'argent , pas de changement pour VOUS!!!");
            return toString();
        }

        finalArray.add("Merci, voici votre changement:\n");

        int twoEuroCoin = change / 200;
        totalCoins += twoEuroCoin;
        change = change % 200;
        if (twoEuroCoin > 0) {
            finalArray.add(twoEuroCoin + ((twoEuroCoin > 1) ? " two euro coins." : " two euro coin."));
        }

        int oneEuroCoin = change / 100;
        totalCoins += oneEuroCoin;
        change = change % 100;
        if (oneEuroCoin > 0) {
            finalArray.add(oneEuroCoin + ((oneEuroCoin > 1) ? " one euro coins." : " one euro coin."));
        }

        int fiftyCentEuro = change / 50;
        totalCoins += fiftyCentEuro;
        change = change % 50;
        if (fiftyCentEuro > 0) {
            finalArray.add(fiftyCentEuro + ((fiftyCentEuro > 1) ? " fifty cent euros." : " fifty cent euro."));
        }

        int twentyCentEuro = change / 20;
        totalCoins += twentyCentEuro;
        change = change % 20;
        if (twentyCentEuro > 0) {
            finalArray.add(twentyCentEuro + ((twentyCentEuro > 1) ? " twenty cent euros." : " twenty cent euro."));
        }

        int tenCentEuro = change / 10;
        totalCoins += tenCentEuro;
        change = change % 10;
        if (tenCentEuro > 0) {
            finalArray.add(tenCentEuro + ((tenCentEuro > 1) ? " ten cent euros." : " ten cent euro."));
        }

        int fiveCentEuro = change / 5;
        totalCoins += fiveCentEuro;
        change = change % 5;
        if (fiveCentEuro > 0) {
            finalArray.add(fiveCentEuro + ((fiveCentEuro > 1) ? " five cent euros." : " five cent euro."));
        }

        int twoCentEuro = change / 2;
        totalCoins += twoCentEuro;
        change = change % 2;
        if (twoCentEuro > 0) {
            finalArray.add(twoCentEuro + ((twoCentEuro > 1) ? " two cent euros." : " two cent euro."));
        }

        int oneCentEuro = change;
        totalCoins += oneCentEuro;
        if (oneCentEuro > 0) {
            finalArray.add(oneCentEuro + ((oneCentEuro > 1) ? " one cent euros." : " one cent euro."));
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
