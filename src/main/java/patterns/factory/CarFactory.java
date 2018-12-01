package patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class CarFactory implements CarCreator {
    @Override
    public Car createAudi(String model, String price) {
        return new Audi(model, price);
    }

    @Override
    public Car createBmw(String model, String price) {
        return new Bmw(model, price);
    }

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> stock = new ArrayList<Car>() {
            {
                add(carFactory.createBmw("E34", "$5.000"));
                add(carFactory.createBmw("E38", "$8.750"));
                add(carFactory.createAudi("A6", "$7.500"));
                add(carFactory.createAudi("100", "$1.500"));
            }
        };

        stock.forEach(x-> System.out.println(x.getInfo()));
    }
}