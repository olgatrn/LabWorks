package labwork.block1;

public class LabWork153 {
    public static void main(String[] args){
        int multiplier = 9;
        System.out.print("* | ");

        for (int a = 1; a <= multiplier; a++) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int b = 1; b <= multiplier; b++) {
            System.out.print("---");
        }

        System.out.println();

        for (int i=1; i <= multiplier; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= multiplier; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
