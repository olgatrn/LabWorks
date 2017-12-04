package labwork2125;

public class MyTestClass {
    public static class MyStaticNested {
        public int a = 20;

        public void printOuter() {
            MyTestClass myTestClass = new MyTestClass();
            System.out.println("Outer a = " + myTestClass.a);
        }
    }

    public class MyInner {
        public int a = 30;

        public void printOuter() {
            System.out.println("Outer a = " + MyTestClass.this.a);
        }
    }

    public int a = 10;
    MyStaticNested myStaticNested = new MyStaticNested();
    MyInner myInner = new MyInner();

    public void testLocal() {
        class MyLocal {
            int a = 50;
        }
        int a = 40;
        MyStaticNested myStaticNested = new MyStaticNested();
        MyInner myInner = new MyInner();
        MyLocal myLocal = new MyLocal();
        System.out.println("Outer a = " + MyTestClass.this.a);
        System.out.println("Static class a = " + myStaticNested.a);
        System.out.println("Inner class a = " + myInner.a);
        System.out.println("Method a = " + a);
        System.out.println("Local class a = " + myLocal.a);
    }

    public void test() {
        int a = 60;
        System.out.println("Method a = " + a);
        System.out.println("Outer a = " + MyTestClass.this.a);
    }
}
