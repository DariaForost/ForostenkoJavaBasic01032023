package HomeWork15;

public class Drinks {
    public static final double COFFEE_PRICE = 35;
    public static final double TEA_PRICE = 12;
    public static final double LEMONADE_PRICE = 20;
    public static final double MOJITO_PRICE = 15.5;
    public static final double SODA_PRICE = 12.8;
    public static final double COCA_COLA_PRICE = 20;

    private static int numberOfDrinksMade = 0;
    private static double totalSales = 0.0;

    public static int getNumberOfDrinksMade() {
        return numberOfDrinksMade;
    }

    public static double getTotalSales() {
        return totalSales;
    }

    public static void makeCoffee() {
        System.out.println("Ваша кава готується...");
        numberOfDrinksMade++;
        totalSales += COFFEE_PRICE;
    }

    public static void makeTea() {
        System.out.println("Ваш чай готується...");
        numberOfDrinksMade++;
        totalSales += TEA_PRICE;
    }

    public static void makeLemonade() {
        System.out.println("Ваш лимонад готується...");
        numberOfDrinksMade++;
        totalSales += LEMONADE_PRICE;
    }

    public static void makeMojito() {
        System.out.println("Ваше мохіто готується...");
        numberOfDrinksMade++;
        totalSales += MOJITO_PRICE;
    }

    public static void makeSoda() {
        System.out.println("Ваша мінералка ...");
        numberOfDrinksMade++;
        totalSales += SODA_PRICE;
    }

    public static void makeCocaCola() {
        System.out.println("Ваша Coca-Cola...");
        numberOfDrinksMade++;
        totalSales += COCA_COLA_PRICE;
    }
}
