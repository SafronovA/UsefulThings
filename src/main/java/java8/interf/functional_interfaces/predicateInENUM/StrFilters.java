package java8.interf.functional_interfaces.predicateInENUM;

import java.util.function.Predicate;

public enum StrFilters implements Predicate<String> {
    MoreThan3(x->x.length()>3),
    LessThan8(x->x.length()<8),
    StartsWithA(x->x.startsWith("A"));

    Predicate<String> stringPredicate;

    StrFilters(Predicate<String> stringPredicate){
        this.stringPredicate=stringPredicate;
    }

    @Override
    public boolean test(String s) {
        return stringPredicate.test(s);
    }

//    Function<String, Boolean> strFilter = o-> o.length()>5;
//    List<String> str = Arrays.asList("fff", "FFF", "FAFAFF", "GWGSG", "ghhrhr");
//        str.stream().filter(o-> Math.random() * 10 > 5).forEach(System.out::println);
}
