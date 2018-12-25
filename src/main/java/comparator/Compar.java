package comparator;

import bo.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compar {
    private List<Item> items = new ArrayList<>();

    //Bad
    public List<Item> sortUseingLambda() {
//        items.sort((item1,item2) -> item2.getPrice().compareTo(item1.getPrice()); //if Item implements Comparable
        items.sort((item1, item2) -> Integer.compare(item2.getPrice(), item1.getPrice()));
        return items;
    }

    //Good
    public List<Item> sortUseingMethodReferanse() {
        items.sort(Comparator.comparing(Item::getPrice));
        return items;
    }

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
