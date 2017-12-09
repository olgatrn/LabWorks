package labwork.block2.theme09.number2;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.println(displayLetters(myStr1, myStr2));
    }

    public static String displayLetters(String string1, String string2) {
        StringBuilder result = new StringBuilder();
        String string1InLowerCase = string1.toLowerCase();
        String string2InLowerCase = string2.toLowerCase();
        for (int i = 0; i < string1InLowerCase.length(); i++) {
            char character = string1InLowerCase.charAt(i);
            if (result.indexOf(character + "") == -1 && string2InLowerCase.indexOf(character) == -1) {
                result.append(character);
            }
        }

// old code
//toLowerCase        char[] arrayOfCharsOfTheFirstString = theFirstStringInLowerCase.toCharArray();
//        for (char item : arrayOfCharsOfTheFirstString) {
//            if (theSecondStringInLowerCase.indexOf(item) == -1) {
//                System.out.println(item);
//            }
//        }

        return result.toString();
    }
}
