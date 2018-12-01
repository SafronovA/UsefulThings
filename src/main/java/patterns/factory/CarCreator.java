package patterns.factory;

public interface CarCreator {
    Car createAudi(String model, String price);
    Car createBmw(String model, String price);
}
