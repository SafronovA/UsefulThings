package comparingPrimAndObj;

import java.util.Objects;

public class Comp {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i11 = new Integer(10);
        Integer i22 = new Integer(10);
        String s1 = "aaa";
        String s2 = "aaa";
        String s11 = new String("aaa");
        String s22 = new String("aaa");

        //int
        System.out.println("\n" + "==int==");
        System.out.println(f1 == f2);
        System.out.println(Objects.equals(f1, f2));
        //Integer
        System.out.println("\n" + "==Integer==");
        System.out.println("--> pool");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("--> heep");
        System.out.println(i11 == i22);
        System.out.println(i11.equals(i22));
        //String
        System.out.println("\n" + "==String==");
        System.out.println("--> pool");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("--> heep");
        System.out.println(s11 == s22);
        System.out.println(s11.equals(s22));

    }
}
