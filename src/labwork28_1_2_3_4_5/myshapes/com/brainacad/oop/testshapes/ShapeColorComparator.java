package labwork28_1_2_3_4_5.myshapes.com.brainacad.oop.testshapes;

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1.color.compareTo(shape2.color);
    }
}
