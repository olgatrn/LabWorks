package labwork294.testtokennizer.com.brainacad.oop.teststokennizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Olga";
        StringTokenizer stringTokenizer1 = new StringTokenizer(myStr);
        while (stringTokenizer1.hasMoreElements()) {
            System.out.println(stringTokenizer1.nextElement());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(myStr, ",");
        while (stringTokenizer2.hasMoreElements()) {
            System.out.println(stringTokenizer2.nextElement());
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(myStr, ".");
        while (stringTokenizer3.hasMoreElements()) {
            System.out.println(stringTokenizer3.nextElement());
        }
    }
}
