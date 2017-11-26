package labwork2101.com.brainacad.oop.testwrapper;

public class Main {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");
        System.out.println("x1 == x2 => " + (x1 == x2) + ", x1.equals(x2) => " + (x1.equals(x2)));
        System.out.println("x1 == x3 => " + (x1 == x3) + ", x1.equals(x3) => " + (x1.equals(x3)));
        System.out.println("x1 == x4 => " + (x1 == x4) + ", x1.equals(x4) => " + (x1.equals(x4)));
        System.out.println("x2 == x3 => " + (x2 == x3) + ", x2.equals(x3) => " + (x2.equals(x3)));
        System.out.println("x2 == x4 => " + (x2 == x4) + ", x2.equals(x4) => " + (x2.equals(x4)));
        System.out.println("x3 == x4 => " + (x3 == x4) + ", x3.equals(x4) => " + (x3.equals(x4)));

        Integer y1 = 225;
        Integer y2 = new Integer(225);
        Integer y3 = Integer.valueOf(225);
        Integer y4 = Integer.parseInt("225");
        System.out.println("y1 == y2 => " + (y1 == y2) + ", y1.equals(y2) => " + (y1.equals(y2)));
        System.out.println("y1 == y3 => " + (y1 == y3) + ", y1.equals(y3) => " + (y1.equals(y3)));
        System.out.println("y1 == y4 => " + (y1 == y4) + ", y1.equals(y4) => " + (y1.equals(y4)));
        System.out.println("y2 == y3 => " + (y2 == y3) + ", y2.equals(y3) => " + (y2.equals(y3)));
        System.out.println("y2 == y4 => " + (y2 == y4) + ", y2.equals(y4) => " + (y2.equals(y4)));
        System.out.println("y3 == y4 => " + (y3 == y4) + ", y3.equals(y4) => " + (y3.equals(y4)));
    }
}
