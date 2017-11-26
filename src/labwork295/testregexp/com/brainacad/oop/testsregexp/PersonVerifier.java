package labwork295.testregexp.com.brainacad.oop.testsregexp;

import java.util.regex.Pattern;

public class PersonVerifier {
    private static final Pattern PATTERN = Pattern.compile("[A-Z][a-z]+");

    public static boolean checkPersonWithRegExp(String userNameString) {
        return PATTERN.matcher(userNameString).matches();
    }
}
