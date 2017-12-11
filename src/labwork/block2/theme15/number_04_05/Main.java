package labwork.block2.theme15.number_04_05;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);
        System.out.println(myNumGenerator.generate());
        System.out.println(myNumGenerator.generateDistinct());
    }
}
