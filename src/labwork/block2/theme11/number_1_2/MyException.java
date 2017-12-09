package labwork.block2.theme11.number_1_2;

public class MyException extends Exception {
    private String reference;

    public MyException(String reference) {
        this.reference = reference;
    }

    public void printReference() {
        System.out.println(reference);
    }
}
