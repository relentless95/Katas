// public class SpinWords {

//     public static String spinWords(String sentence) {
//         // TODO: Code stuff here
//         String[] arr = sentence.split(" ");

//         String result = "";

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i].length() >= 5) {

//                 for (int j = arr[i].length() - 1; j >= 0; j--) {

//                     result += arr[i].charAt(j);

//                     System.out.println("result1 : " + result);

//                 }

//             } else {

//                 result += arr[i];

//             }
//             result += " ";

//         }

//         return result.trim();
    // }


    import java.util.stream.*;
import java.util.Arrays;

public class SpinWords {

  public static String SpinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }


    public static void main(String[] args) {
        SpinWords("the man is a man in a manss world");
        SpinWords("This is another test");
        
    }
}
