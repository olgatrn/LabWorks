package labwork.block2.theme09.number1;

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        String substringToSearchFor = "ra";
        String substringCreated = myStr.substring(3, 7);
        System.out.println(myStr.indexOf(substringToSearchFor));
        System.out.println(myStr.lastIndexOf(substringToSearchFor));
        System.out.println(substringCreated);
        System.out.println(reverseString(myStr));
    }

    public static String reverseString(String stringToReverse) {
        return new StringBuilder(stringToReverse).reverse().toString();

//        old code
//        StringBuilder stringBuilder = new StringBuilder(stringToReverse);
//        String reversedString = stringBuilder.reverse().toString();
//        return reversedString;
    }
}
