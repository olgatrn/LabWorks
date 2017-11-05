import java.util.Arrays;

public class LabWork164 {
    public static void main(String[] args){
        int[] m = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14, 25, 101, 316, 10};

        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        System.out.print(Arrays.binarySearch(m, 25));
    }
}
