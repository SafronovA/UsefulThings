package java8.optional;

import bo.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Opt {

    private List<Item> items = new ArrayList<>();

    //Bad
    public String getNameByPrice(int price) {
        String name = findByPrice(price);
        if (name == null) {
            throw new IllegalStateException("bla-bla");
        }
        return name;
    }

    //Good
    public String getNameByPriceWithOptional(int price) {
        return Optional.ofNullable(findByPrice(price)).orElseThrow(() -> new IllegalStateException("bla-bla"));
    }

    public String findByPrice(int price) {
        ///
        return null;
    }
}
