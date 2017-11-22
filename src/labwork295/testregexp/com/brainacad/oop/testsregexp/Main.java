package labwork295.testregexp.com.brainacad.oop.testsregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfUserNames = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", ""};
        for (String userName : arrayOfUserNames) {
            System.out.println(checkPersonWithRegExp(userName));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]+");
        Matcher matcher = pattern.matcher(userNameString);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
