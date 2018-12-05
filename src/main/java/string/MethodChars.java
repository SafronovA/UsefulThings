package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodChars {
    /**
     * @ return unique chars from all strings
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("asdf", "fssa");
        System.out.println(list.stream().flatMap(x -> x.chars().mapToObj(s -> (char) s)).distinct().collect(Collectors.toList()));
    }
}
