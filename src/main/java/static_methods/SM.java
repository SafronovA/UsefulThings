package static_methods;

public class SM {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        a.method();
        b.method();
    }
}
