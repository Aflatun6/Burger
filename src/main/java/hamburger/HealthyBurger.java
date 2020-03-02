package hamburger;

import hamburger.Hamburger;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "Brown tye", price);
    }
    public void addHealthAddition1(String name,double price){
        healthyExtra1Name=name;
        healthyExtra1price=price;
    }
    public void addHealthAddition2(String name,double price){
        healthyExtra2Name=name;
        healthyExtra2price=price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice= super.itemizeHamburger();
        if(healthyExtra1Name!=null){
            hamburgerPrice+=healthyExtra1price;
            System.out.println("Added "+healthyExtra1Name+" for an extra "+healthyExtra1price);

        }
        if(healthyExtra2Name!=null){
            hamburgerPrice+=healthyExtra2price;
            System.out.println("Added "+healthyExtra2Name+" for an extra "+healthyExtra2price);

        }
        return hamburgerPrice;
    }
}
