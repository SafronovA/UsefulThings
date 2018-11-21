package factorial;

public class Factorial {

    static long factRec(int j){
        if (j<0) return -1;
        if (j==0) return 1;
        return j*factRec(j-1);
    }

    static long factIter(int j){
        if (j<0) return -1;
        if (j==0) return 1;
        long result = 1;
        for (int i = 1; i <= j ; i++) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factRec(5));
        System.out.println(Factorial.factIter(5));
    }
}
