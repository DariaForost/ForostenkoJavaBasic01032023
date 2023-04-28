package HomeWork15;

import java.util.Scanner;

public class DrinksOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Оберіть напій:");
            DrinksMachine Drink1 = HomeWork15.DrinksMachine.COFFEE;
            System.out.println("1." + Drink1);
            DrinksMachine Drink2 = HomeWork15.DrinksMachine.TEA;
            System.out.println("2." + Drink2);
            DrinksMachine Drink3 = HomeWork15.DrinksMachine.LEMONADE;
            System.out.println("3." + Drink3);
            DrinksMachine Drink4 = HomeWork15.DrinksMachine.MOJITO;
            System.out.println("4." + Drink4);
            DrinksMachine Drink5 = HomeWork15.DrinksMachine.SODA;
            System.out.println("5." + Drink5);
            DrinksMachine Drink6 = HomeWork15.DrinksMachine.COCA_COLA;
            System.out.println("6." + Drink6);
            System.out.println("0. Закінчити вибір напоїв");
            System.out.print("Введіть Ваш вибір: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    Drinks.makeCoffee();
                    break;
                case 2:
                    Drinks.makeTea();
                    break;
                case 3:
                    Drinks.makeLemonade();
                    break;
                case 4:
                    Drinks.makeMojito();
                    break;
                case 5:
                    Drinks.makeSoda();
                    break;
                case 6:
                    Drinks.makeCocaCola();
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз");
                    break;
            }
        }

        System.out.println("Кількість напоїв: " + Drinks.getNumberOfDrinksMade() + " напоїв.");
        System.out.println("Ціна напоїв: " + Drinks.getTotalSales() + " грн.");
    }
}
