package labwork2125;

public class Main {
    public static void main(String[] args) {
        MyTestClass myTestClass = new MyTestClass();

        System.out.println("Outer a = " + myTestClass.a);
        System.out.println("Static class a = " + myTestClass.myStaticNested.a);
        System.out.println("Nested class a = " + myTestClass.myInner.a);

        myTestClass.myStaticNested.printOuter();
        myTestClass.myInner.printOuter();

        myTestClass.testLocal();
        myTestClass.test();
    }
}
