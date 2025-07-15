package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public HealthyBurger(String name, double price, String breadRollType, String healthyExtra1Name, double healthyExtra1Price, String healthyExtra2Name, double healthyExtra2Price) {
        super(name, "Tofu", price, breadRollType);
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            hamburgerPrice +=healthyExtra1Price;
            System.out.println(healthyExtra1Name + healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
            System.out.println(healthyExtra2Name + healthyExtra2Price);
        }

        System.out.println(hamburgerPrice);

        setPrice(hamburgerPrice);
        return hamburgerPrice;
    }


}
