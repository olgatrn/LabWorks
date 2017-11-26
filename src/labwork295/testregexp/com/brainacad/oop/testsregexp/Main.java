package labwork295.testregexp.com.brainacad.oop.testsregexp;

public class Main {

    public static void main(String[] args) {

        String[] arrayOfUserNames = {
                "VOVA",
                "Ivan",
                "R2d2",
                "ZX",
                "Anna",
                "12345",
                "ToAd",
                "TomCat",
                ""};
        for (String userName : arrayOfUserNames) {
            System.out.printf("%s: %s%n", userName, PersonVerifier.checkPersonWithRegExp(userName));
        }
    }
}
