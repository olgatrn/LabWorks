package labwork2115;

public class TestAsset {
    public static void main(String[] args) {
        System.out.println(compute(new Byte((byte) 4), new Integer(255)));
        long correctResult = 259;
        assert correctResult == compute(new Byte((byte) 4), new Integer(255));
    }

    public static Long compute(Byte ByteObject, Integer IntegerObject) {
//        return new Long(ByteObject + IntegerObject);
        return 0L;
    }
}
