package labwork.block2.theme09.number5;

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
