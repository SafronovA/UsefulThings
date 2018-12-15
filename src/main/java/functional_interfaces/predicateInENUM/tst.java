package functional_interfaces.predicateInENUM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class tst {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dklsjf;ds", "sdfdsfdsf", "sdf", "dfffff", "dffdd", "ffffff", "asdweee", "po");
        System.out.println(strings.stream().filter(StrFilters.MoreThan3).collect(Collectors.joining(" ")));
        System.out.println(strings.stream().filter(StrFilters.LessThan8).collect(Collectors.joining(" ")));

        String str1 = strings.stream().reduce((x1, x2) -> "" + x1 + " " + x2 + "").get();
        System.out.println(str1);
        String str2 = strings.stream().reduce((x1, x2) -> x2).get();
        System.out.println(str2);
    }
}
//      Output
//        dklsjf;ds sdfdsfdsf dfffff dffdd ffffff asdweee
//        sdf dfffff dffdd ffffff asdweee po
//        dklsjf;ds sdfdsfdsf sdf dfffff dffdd ffffff asdweee po
//        po
