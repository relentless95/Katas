package Java.kyu6.katas.src;

class ConvertToCamelCase {

    static String toCamelCase(String s) {
        

        boolean capitalizeNext  = false;
        String camelCase = "";

        for (int i = 0; i < s.length(); i++) {
            char chr  = s.charAt(i);
            String letter = Character.toString(chr);
            if(letter.equals("-") || letter.equals("_")){
                capitalizeNext = true;
            } else{
            camelCase += capitalizeNext ? letter.toUpperCase(): chr;
            System.out.println("in the for loop: "+ camelCase);
            capitalizeNext = false;
            }

        }

        return camelCase;
    };

    public static void main(String[] args) {
        toCamelCase("what-is-going-on-here");
    }

}