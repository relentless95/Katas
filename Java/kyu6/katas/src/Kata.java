import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kata {
    public static boolean hasUniqueChars(String str) {
        // char[] arr = str.toCharArray();
        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i + 1; j < str.length(); j++) {
        // if (arr[i] == arr[j]) {
        // System.out.println(false);
        // return false;
        // }
        // }
        // }
        // System.out.println(true);
        // return true;

        char[] chars = str.toCharArray();
        // Arrays.sort(chars);
        // for(char c:chars){
        // System.out.println(c);
        // }
        // for (int i = 0; i < chars.length - 1; i++) {
        // if (chars[i] == chars[i + 1]) {
        // return false;
        // }
        // }
        // return true;

        Set<Character> s = new HashSet<Character>();
        for (char c : chars) {
            System.out.println(c);
            System.out.println("here:" + s.add(c));            
            System.out.println("here:" + s.add(c));


            if (!s.add(c)) {
                System.out.println(false);
                return false;
            }

        }

        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("pinapPle"));
    }
}
