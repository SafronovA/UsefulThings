package abstractClass;

public class SomeClass extends Abstr {
    private String age;

    public SomeClass(String name, String age) {
        super(name);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public static void main(String[] args) {
        SomeClass someClass1 = new SomeClass("1111", "11");
        SomeClass someClass2 = new SomeClass("2222", "22");
        SomeClass someClass3 = new SomeClass("3333", "33");

        System.out.println(someClass1.getAge());
        System.out.println(someClass1.getName());
        System.out.println(someClass2.getAge());
        System.out.println(someClass2.getName());
        System.out.println(someClass3.getAge());
        System.out.println(someClass3.getName());
    }
}
