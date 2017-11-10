import java.util.Arrays;

class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view() {
        System.out.println("manufacturer: " + manufacturer + ", serialNumber: " + serialNumber + ", price: " + price +
         ", quantityCPU:" + quantityCPU + ", quantityCPU:" + quantityCPU);
    }
}

public class LabWork21 {
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
