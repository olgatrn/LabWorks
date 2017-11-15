class GravityCalculator {
    public static double calculateDistance(double time) {
        double distance;
        final double acceleration = -9.81;
        final double initialVelocity = 0;
        final double initialPosition = 0;
        distance = (double) 0.5 * acceleration * time * time + initialVelocity * time + initialPosition;
        return distance;
    }
}

public class LabWork247 {
    public static void main(String[] args) {
        final double TIME = 3600;
        System.out.println(GravityCalculator.calculateDistance(TIME));
    }
}
