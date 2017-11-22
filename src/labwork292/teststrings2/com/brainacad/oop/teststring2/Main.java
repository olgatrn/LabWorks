package labwork292.teststrings2.com.brainacad.oop.teststring2;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        displayLetters(myStr1, myStr2);
    }

    public static void displayLetters(String theFirstString, String theSecondString) {
        String theFirstStringInLowerCase = theFirstString.toLowerCase();
        String theSecondStringInLowerCase = theSecondString.toLowerCase();
        char[] arrayOfCharsOfTheFirstString = theFirstStringInLowerCase.toCharArray();
        for (char item : arrayOfCharsOfTheFirstString) {
            if (theSecondStringInLowerCase.indexOf(item) == -1) {
                System.out.println(item);
            }
        }

//        char[] arrayOfCharsOfTheFirstString = theFirstString.toCharArray();
//        for (char item : arrayOfCharsOfTheFirstString) {
//            if (theSecondString.indexOf(item) == -1) {
//                System.out.println(item);
//            }
//        }

    }
}
