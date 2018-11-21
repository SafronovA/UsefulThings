package fibonacci;

public class Fibonacci {

    static int fiboRec(int n){
       if (n <= 1) return n;
       else return fiboRec(n-1) + fiboRec(n-2);
    }

     static void fibIter(int i) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0);
        System.out.println(n1);
        for (int j = 3; j < i; j++) {
            n2 = n0 + n1;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }

    public static void main(String[] args) {
        // fibRec
        for (int i = 0; i <10 ; i++) {
            System.out.println(fiboRec(i));
        }
        // fibIter
        fibIter(10);
    }
}
