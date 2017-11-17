package labwork255;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_INSTANCES = 5;
        InitTest[] arrayOfInstances = new InitTest[NUMBER_OF_INSTANCES];
        for (int i = 0; i < NUMBER_OF_INSTANCES; i++) {
            arrayOfInstances[i] = new InitTest();
            System.out.println(arrayOfInstances[i].getId());
        }
    }
}
