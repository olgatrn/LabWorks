package labwork211_1_2.com.brainacad.oop.testexcp1;

public class MyException extends Exception {
    private String reference;

    public MyException(String reference) {
        this.reference = reference;
    }

    public void printReference() {
        System.out.println(reference);
    }
}
