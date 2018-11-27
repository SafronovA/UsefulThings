package static_methods;

import java.util.Objects;

public class SM {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        a.method();
        b.method();

        int f1 = 1;
        int f2 = 1;
        Integer i1 = 2;
        Integer i2 = 2;
        String s1 = "aaa";
        String s2 = "aaa";
        String s11 = new String("aaa");
        String s22 = new String("aaa");

        //int
        System.out.println("int");
        System.out.println(f1==f2);
        System.out.println(Objects.equals(f1, f2));
        //Integer
        System.out.println("Integer");
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        //String pool
        System.out.println("String pool");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        //String heep
        System.out.println("String heep");
        System.out.println(s11==s22);
        System.out.println(s11.equals(s22));

    }
}
