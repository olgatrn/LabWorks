package labwork.block2.theme14.number_2_3;

public class MyTestMethod {
    public static <T extends Number> int calculateNumber(T[] array, T maxElement) {
        int numberOfValues = 0;
        for (T t : array) {
            if (t.doubleValue() > maxElement.doubleValue()) {
                numberOfValues++;
            }
        }
        return numberOfValues;
    }

    public static <T extends Number> T calculateSum(T[] array, T maxValue) {
        double sum = 0;
        for (T t : array) {
            if (t.doubleValue() > maxValue.doubleValue()) {
                sum += t.doubleValue();
            }
        }
        T sumGenericType = (T) (Double) sum;
        return sumGenericType;
    }
}
