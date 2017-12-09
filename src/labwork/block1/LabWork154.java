package labwork.block1;

public class LabWork154 {
    public static void main(String[] args){
        int divider1 = 3;
        int divider2 = 4;
        int counter = 0;
        for (int i=1; i <= 300; i++) {
            if (i % divider1 == 0 | i % divider2 == 0) {
                System.out.println(i);
                counter++;
                if (counter == 10) {
                    break;
                }
            }
        }
    }
}
