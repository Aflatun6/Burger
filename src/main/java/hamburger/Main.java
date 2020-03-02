package hamburger;

import hamburger.DeluxeBurger;
import hamburger.Hamburger;
import hamburger.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger h=new Hamburger("Basic","Sausage","White",3.56);
        h.addHamburgerAddition1("Tomato",0.72);
        h.addHamburgerAddition2("Lettuce",0.39);
        h.addHamburgerAddition3("Cheese",1.12);
        System.out.println("Total price is "+h.itemizeHamburger());

        HealthyBurger h2=new HealthyBurger("Bacon",5.66);
        h2.addHamburgerAddition1("Egg",5.34);
        h2.addHealthAddition1("Sauce",2.37);
        System.out.printf("Total is %.2f",h2.itemizeHamburger());

        DeluxeBurger d = new DeluxeBurger();
        System.out.printf("Total is %.2f",d.itemizeHamburger());


    }
}
