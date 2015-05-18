import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Greedy {


    public static String coinsGiven;

    public static void main(String[] varArgs) {

        if (varArgs.length >= 1) {
            coinsGiven = varArgs[0];
            ApplicationContext context = new ClassPathxmlApplicationContext("ApplicationContext.xml");

            Greedy obj = (Greedy) context.getBean("greedy1");
            obj.start();
//            Greedy greedy1 = new Greedy(ChangeCalculator.getInstance());

        }else {
            throw new IllegalArgumentException("No value given");
        }
    }

    private  ChangeCalculator changeCalculator;

    public Greedy(ChangeCalculator changeCalculator) {
        this.changeCalculator = changeCalculator;
    }

    public final static String EURO = "\u20ac";

    public void start() {
        if (coinsGiven.contains("$")) {
            UsCoinCalculator usChange = changeCalculator.usChangeReturned(coinsGiven);
            usChange.changeBack(coinsGiven);
            System.out.println(usChange);
        }

        if (coinsGiven.contains(EURO)) {
            EuroCoinCalculator euroChange = ChangeCalculator.getInstance().euroChangeReturned(coinsGiven);
            euroChange.changeBack(coinsGiven);
            System.out.println(euroChange);
        }
    }
}
