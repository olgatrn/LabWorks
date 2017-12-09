package labwork.block2.theme09.number4;

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
