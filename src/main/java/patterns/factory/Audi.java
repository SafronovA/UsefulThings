package patterns.factory;

public class Audi implements Car {
    String brand = "Audi";
    String model;
    String price;

    public Audi(String model, String price){
        this.model=model;
        this.price=price;
    }

    @Override
    public String getInfo() {
        return brand + " " + model + " - " + price;
    }
}
