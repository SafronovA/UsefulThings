package traning;

import java.util.ArrayList;
import java.util.Collections;

public class A{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(1);

        list.forEach(System.out::print);
        System.out.println();

        Collections.sort(list);
        list.forEach(System.out::print);
        System.out.println();

        list.sort(Collections.reverseOrder());
        list.forEach(System.out::print);
    }

}
