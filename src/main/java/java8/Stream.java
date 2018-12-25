package java8;

import bo.Item;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(new Item(1, "nike")
                , new Item(2, "adic")
                , new Item(3, "fila")
                , new Item(4, "nike")
                , new Item(5, "nike")
                , new Item(6, "adic"));

        Map<String, List<Item>> map1 = items.stream().collect(Collectors.groupingBy(Item::getName)); //Key - name, Value - List of Items with such name

        map1.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(i -> System.out.println(i.getPrice()));
        });
//        Output
//        adic
//        2
//        6
//        nike
//        1
//        4
//        5
//        fila
//        3


        Map<String, Long> map2 = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting())); //Key - name, Value - number of Items with such name
        map2.forEach((key, value) -> System.out.println(key + " " + value));
//        Output
//        adic 2
//        nike 3
//        fila 1
    }
}
