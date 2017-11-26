package labwork294.testtokennizer.com.brainacad.oop.teststokennizer;

        import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Olga";
        StringTokenizer stringTokenizer = new StringTokenizer(myStr, ".,");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
    }
}
