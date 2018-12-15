package patterns.builder;

public class Builder {
    private String name;
    private int age = 0;
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person build() {
        return new Person(this);
    }

}
