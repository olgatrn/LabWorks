package labwork.block2.theme09.number3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Using methods of class String";
        System.out.println(Arrays.toString(uniqueChars(str)));
    }

    public static char[] uniqueChars(String string) {
        string = string.toLowerCase();
        char[] array = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : array) {
            if (string.indexOf(c) == string.lastIndexOf(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString().toCharArray();

//        old code
//        char[] resultArrayOfUniqueChars;
//        String stringInLowerCase = string.toLowerCase();
//        char[] arrayOfCharsOfString = stringInLowerCase.toCharArray();
//        StringBuilder stringBuider = new StringBuilder();
//        for (int item = 0; item < arrayOfCharsOfString.length; item++) {
//            if (stringInLowerCase.indexOf(arrayOfCharsOfString[item]) ==
//                    stringInLowerCase.lastIndexOf(arrayOfCharsOfString[item])) {
//                stringBuider.append(arrayOfCharsOfString[item]);
//            }
//        }
//        resultArrayOfUniqueChars = stringBuider.toString().toCharArray();
//        return resultArrayOfUniqueChars;
    }
}
