public class LabWork162 {
    public static void main(String[] args){
        int[] m = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int theMaxValue = 0;
        int theMinValue = m[0];
        int theSumOfValues = 0;
        float theAverageValue;

        for (int element : m) {
            if (element > theMaxValue) {
                theMaxValue = element;
            }
            if (element < theMinValue) {
                theMinValue = element;
            }
            theSumOfValues += element;
        };

        theAverageValue = (float) theSumOfValues / m.length;

        System.out.println(theMaxValue);
        System.out.println(theMinValue);
        System.out.println(theAverageValue);
    }
}
