package labwork.block2.theme11.number_1_2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an exception.");
        } catch (Exception e) {
            System.out.println("Exseption is caught.");
        } finally {
            System.out.println("We were there.");
        }
        try {
            throw new MyException("About my axception.");
        } catch (MyException e) {
            System.out.println("My exception is caught.");
        }
        try {
            ClassForSorting.test();
        } catch (MyException e) {
            System.out.println("My exception is caught.");
        }
        ClassForSorting myTest = new ClassForSorting();
        myTest = null;
        try {
            myTest.test();
        } catch (MyException e) {
            System.out.println("My exception is called.");
        }
    }
}
