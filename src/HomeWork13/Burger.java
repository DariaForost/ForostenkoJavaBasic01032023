package HomeWork13;

class Burger {
    String bun;
    String meat;
    String cheese;
    String veggies;
    String mayo;

    // Конструктор для звичайного бургера
    public Burger(String bun, String meat, String cheese, String veggies, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        System.out.println("Склад звичайного бургера: " + bun + ", " + meat + ", " + cheese + ", " + veggies + ", " + mayo);
    }

    // Конструктор для дієтичного бургера
    public Burger(String bun, String meat, String cheese, String veggies) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = "";
        System.out.println("Склад дієтичного бургера: " + bun + ", " + meat + ", " + cheese + ", " + veggies);
    }

    // Конструктор для бургера з подвійним м'ясом
    public Burger(String bun, String meat, String cheese, String veggies, String mayo, boolean doubleMeat) {
        this.bun = bun;
        this.meat = doubleMeat ? (meat + " x2") : meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        System.out.println("Склад бургера з подвійним м'ясом: " + bun + ", " + this.meat + ", " + cheese + ", " + veggies + ", " + mayo);
    }
}

class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("булочка", "котлета з яловичиною", "чеддер", "помідор", "майонез");
        Burger dietBurger = new Burger("булочка", "котлета на пару із курятини", "моцарела", "салат");
        Burger doubleMeatBurger = new Burger("булочка", "котлета зі свинини", "гауда", "огірок", "гірчиця", true);
    }
}