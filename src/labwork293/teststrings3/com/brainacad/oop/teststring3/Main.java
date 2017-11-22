package labwork293.teststrings3.com.brainacad.oop.teststring3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Using methods of class String";
        System.out.println(Arrays.toString(uniqueChars(str)));
    }

    public static char[] uniqueChars(String string) {
        char[] resultArrayOfUniqueChars;
        String stringInLowerCase = string.toLowerCase();
        char[] arrayOfCharsOfString = stringInLowerCase.toCharArray();
        StringBuilder stringBuider = new StringBuilder();
        for (int item = 0; item < arrayOfCharsOfString.length; item++) {
            if (stringInLowerCase.indexOf(arrayOfCharsOfString[item]) ==
                    stringInLowerCase.lastIndexOf(arrayOfCharsOfString[item])) {
                stringBuider.append(arrayOfCharsOfString[item]);
            }
        }
        resultArrayOfUniqueChars = stringBuider.toString().toCharArray();
        return resultArrayOfUniqueChars;
    }
}
