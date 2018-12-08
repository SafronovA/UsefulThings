package patterns.builder;

public class Person {
    private String name;
    private int age;
//    private Optional<Integer> age;

    public Person(Builder builder) {
        name = builder.name;
        age = builder.age;
    }

    public static class Builder {
        private String name;
        private int age = 30;
//        private Optional<Integer> age = Optional.empty();

        public Builder(String name) {
            this.name = name;
        }

        public Builder addAge(int age) {
            this.age = age;
            return this;
        }

//        public Builder addAge(int age) {
//            this.age = Optional.ofNullable(age);
//            return this;
//        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person person = new Builder("Safronava").addAge(54).build();
    }
}
