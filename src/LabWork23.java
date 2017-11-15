class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

//    public MyWindow() {}

    public MyWindow() {
        this(2.75, 2.25, 2, "white", true);
    }

    public MyWindow(double width) {
        this(width, 2.25, 2, "white", true);
    }

    public MyWindow(double width, double height) {
        this(width, height, 2, "white", true);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, "white", true);
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this(width, height, numberOfGlass, color, true);
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public void printFields() {
        System.out.println("Width: " + width + ", height: " + height + ", numberOfGlass: " + numberOfGlass +
                ", color: " + color + ", isOpen: " + isOpen + ".");
    }
}

public class LabWork23 {
    public static void main(String[] args) {
        MyWindow window1 = new MyWindow();
        MyWindow window2 = new MyWindow(2);
        MyWindow window3 = new MyWindow(2, 4.5);
        MyWindow window4 = new MyWindow(1, 3.7, 5);
        MyWindow window5 = new MyWindow(2, 6.7, 3, "red");
        MyWindow window6 = new MyWindow(7.8, 4.3, 2, "black", false);
        MyWindow[] myWindowsArray = new MyWindow[6];
        myWindowsArray[0] = new MyWindow();
        myWindowsArray[1] = new MyWindow(2);
        myWindowsArray[2] = new MyWindow(2, 4.5);
        myWindowsArray[3] = new MyWindow(1, 3.7, 5);
        myWindowsArray[4] = new MyWindow(2, 6.7, 3, "red");
        myWindowsArray[5] = new MyWindow(7.8, 4.3, 2, "black", false);
        window1.printFields();
        window2.printFields();
        window3.printFields();
        window4.printFields();
        window5.printFields();
        window6.printFields();
        myWindowsArray[0].printFields();
        myWindowsArray[1].printFields();
        myWindowsArray[2].printFields();
        myWindowsArray[3].printFields();
        myWindowsArray[4].printFields();
        myWindowsArray[5].printFields();
    }
}
