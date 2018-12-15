package patterns.builder;

public class Person {
    private String name;
    private int age;
//    private Optional<Integer> age;

    public Person(Builder builder) {
        name = builder.getName();
        age = builder.getAge();
    }

    ///////////////////////
    public static void main(String[] args) {
        Person person = new Builder("Alex").addAge(43).build();
    }
}
