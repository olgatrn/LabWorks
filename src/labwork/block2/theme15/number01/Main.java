package labwork.block2.theme15.number01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("number_" + Integer.toString(i));
        }
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
}
