package labwork296;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern PATTERN = Pattern.compile("([+-]?\\d{1,3}(,(\\d{3}))*[.]\\d*)|([+-]?\\d+[.,]\\d*)");

    public static void main(String[] args) {
        String[] arrayOfNumbers = {
                "3456,67",
                "4,678,345,546.890754",
                "+7,5",
                "6.0",
                "5,435.67",
                "543",
                "ToAd",
                "5435,56",
                ".",
                "-5,789.09"};
        for (String number : arrayOfNumbers) {
            System.out.printf("%s: %s%n", number, checkNumberWithRegExp(number));
        }
    }

    public static boolean checkNumberWithRegExp(String string) {
        Matcher matcher = PATTERN.matcher(string);
        return matcher.matches();
    }
}
