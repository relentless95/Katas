
public class Kata {
    public static boolean hasUniqueChars(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(false);
                    return false;
                }
            }
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        hasUniqueChars("pinapple"); 
    }
}
