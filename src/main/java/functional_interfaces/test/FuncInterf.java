package functional_interfaces.test;

import java.util.function.*;

public class FuncInterf {

    public static void main(String[] args) {
        Predicate<Integer> moreThanTwo = x -> x > 2;
        System.out.println(moreThanTwo.test(4));

        BinaryOperator<Integer> mult = (x, y) -> x * y;
        System.out.println(mult.apply(2, 3));

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(10));

        Function<Integer, String> convert = x-> String.valueOf(x) + "$";
        System.out.println(convert.apply(3));

        Consumer<Integer> printer = x -> System.out.printf("%d $", x);
        printer.accept(100);
    }
}
