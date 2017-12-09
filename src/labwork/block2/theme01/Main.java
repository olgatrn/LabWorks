package labwork.block2.theme01;

public class Main {
    public static void main(String... args) {

        final int NUMBER_OF_COMPUTER_OBJECTS = 5;
        Computer[] arrayOfComputerObjects = new Computer[NUMBER_OF_COMPUTER_OBJECTS];

        for (int i = 0; i < NUMBER_OF_COMPUTER_OBJECTS; i++) {
            arrayOfComputerObjects[i] = new Computer();
            arrayOfComputerObjects[i].setPrice(950F);
            System.out.println(arrayOfComputerObjects[i].getPrice());
        }

        for (int i = 0; i < NUMBER_OF_COMPUTER_OBJECTS; i++) {
            arrayOfComputerObjects[i].setPrice(arrayOfComputerObjects[i].getPrice() * 1.1f);
            System.out.println(arrayOfComputerObjects[i].getPrice());
        }

        for (Computer element : arrayOfComputerObjects) {
            element.view();
        }
    }
}
