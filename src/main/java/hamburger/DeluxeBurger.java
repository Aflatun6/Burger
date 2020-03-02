package hamburger;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe","Sausage & Bacon","White",14.36);
        super.addHamburgerAddition1("Chips",1.51);
        super.addHamburgerAddition2("Drink",2.17);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot ovveride that funciton!");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot ovveride that funciton!");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot ovveride that funciton!");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot ovveride that funciton!");
    }
}
