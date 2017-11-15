class MyCalc {
    public static double calcPi(int numberOfTerms) {
        double pi = 0;
        int divisor = 1;
        if (numberOfTerms < 0) {
            numberOfTerms -= numberOfTerms;
        }
        for (int i = 1; i <= numberOfTerms; i++) {
            if (i % 2 != 0) {
                pi += (double) 4 / divisor;
                divisor += 2;
            } else {
                pi -= (double) 4 / divisor;
                divisor += 2;
            }
        }
        return pi;
    }
}

public class LabWork245 {
    public static void main(String[] args) {
        final int NUMBER_OF_TERMS = 6;
        System.out.println(MyCalc.calcPi(NUMBER_OF_TERMS));
    }
}
