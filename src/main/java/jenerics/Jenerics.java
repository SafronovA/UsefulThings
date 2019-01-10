package jenerics;

import java.util.ArrayList;
import java.util.List;

public class Jenerics {
    /*
    принцип PECS
    Producer
    extends
       Consumer
       super
     */
    public static void main(String[] args) {
        List<? extends Number> list1 = new ArrayList<>();
//        list1.add(1);

        List<? super Number> list2 = new ArrayList<>();
        list2.add(1.0);
    }
}
