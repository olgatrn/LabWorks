package labwork.block2.theme15.number02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number;
            do {
                number = random.nextInt(10);
            } while (list.contains("num_" + Integer.toString(number)));
            list.add("num_" + Integer.toString(number));
        }
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
}
