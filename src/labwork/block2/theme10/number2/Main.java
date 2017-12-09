package labwork.block2.theme10.number2;

public class Main {
    public static void main(String[] args) {
        System.out.println(compute(new Byte((byte) 4), new Integer(255)));
    }

    public static Long compute(Byte ByteObject, Integer IntegerObject) {
        return new Long(ByteObject + IntegerObject);
    }
}
