package flip_string;

public class FlipStr {

    static String flip(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(FlipStr.flip("qwerty"));
    }
}
