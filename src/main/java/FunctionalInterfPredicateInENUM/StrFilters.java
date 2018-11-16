package FunctionalInterfPredicateInENUM;

import java.util.function.Predicate;

public enum StrFilters implements Predicate<String> {
    MoreThan3(x->x.length()>3),
    LessThan8(x->x.length()<8);
    Predicate<String> stringPredicate;

    StrFilters(Predicate<String> stringPredicate){
        this.stringPredicate=stringPredicate;
    }

    @Override
    public boolean test(String s) {
        return stringPredicate.test(s);
    }
}
