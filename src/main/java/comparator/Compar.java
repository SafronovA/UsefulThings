package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compar {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<Item>() {
            {
                add(new Item(2, "a"));
                add(new Item(3, "a"));
                add(new Item(6, "a"));
                add(new Item(1, "a"));
                add(new Item(5, "a"));
                add(new Item(2, "b"));
                add(new Item(3, "b"));
                add(new Item(6, "b"));
                add(new Item(1, "b"));
                add(new Item(5, "b"));
            }
        };

        Comparator cPrice = (Comparator<Item>) (o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice());


        Collections.sort(list, cPrice);
        list.forEach(x -> System.out.println(x.getPrice() + " " + x.getName()));
    }
}
