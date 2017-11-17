package labwork251;

class MyInitTest {
    private int integerValue;
    private boolean booleanValue;

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    public MyInitTest(int integerValue) {
        this(integerValue, true);
        System.out.println("constructor 1");
    }

    public MyInitTest(int integerValue, boolean booleanValue) {
        this.integerValue = integerValue;
        this.booleanValue = booleanValue;
        System.out.println("constructor 2");
    }
}
