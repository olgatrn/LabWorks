package labwork.block2.theme15.number_04_05;

import java.util.*;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        List<Integer> list = new ArrayList<>(numOfElm);
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

    public Set<Integer> generateDistinct() {
        Set<Integer> set = new HashSet<>(numOfElm);
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            set.add(random.nextInt(maxNumb));
        }
        return set;
    }
}
