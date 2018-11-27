package static_methods;

public class A implements Cloneable{
    int a = 3;
    int n = 34;
    int m = 31;
    public static void method(){
            System.out.println("static method from A");
    }

    @Override
    public String toString() {
        return "AAAAAAA";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
