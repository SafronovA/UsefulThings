package fibonacci;

public class Fibonacci {

    static int fibRec(int n) {
        if (n <= 1) return -1;
        else return fibRec(n - 1) + fibRec(n - 2);
    }

    static int[] fibIter(int i) {
        int[] res = new int[i];
        if (i < 1) return res;
        res[0] = res[1] = 1;
        for (int j = 2; j < i; j++) {
            res[j] = res[j - 1] + res[j - 2];
        }
        return res;
    }

    public static void main(String[] args) {
        // fibRec
        for (int i = 0; i < 10; i++) {
            System.out.println(fibRec(i));
        }
        // fibIter
        for (int i = 0; i < 10; i++) {
            System.out.println(fibIter(10)[i]);
        }
    }
}
