package labwork.block2.theme06.number5.shapes;

import static java.lang.Math.*;

public class Triangle {
    double a = 1;
    double b = 1;
    double c = 1;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        double area = sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
