public class LabWork163 {
    public static void main(String[] args){
        int[][] myArray = {{1, 5, 9, 13},
                            {2, 6, 10, 14},
                            {3, 7, 11, 15},
                            {4, 8, 12, 16}};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length ; j++) {
                System.out.print("\t" + myArray[i][j]);
            };

            System.out.print("\n");
        };
    }
}