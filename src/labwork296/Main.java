package labwork296;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfUserNames = {"3456,67", "4,678,345,546.890754", "7,5", "6.0",
                "5,435.67", "543", "ToAd", "5435,56", "."};
        for (String userName : arrayOfUserNames) {
            System.out.println(checkPersonWithRegExp(userName));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pattern = Pattern.compile("(\\d{1,3}(,(\\d{3}))*[.]\\d+)|(\\d+[.,]\\d+)");
        Matcher matcher = pattern.matcher(userNameString);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
