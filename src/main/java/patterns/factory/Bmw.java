package patterns.factory;

public class Bmw implements Car {
    String brand = "BMW";
    String model;
    String price;

    public Bmw (String model, String price){
        this.model=model;
        this.price=price;
    }

    @Override
    public String getInfo() {
        return brand + " " + model + " - " + price;
    }
}