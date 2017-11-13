public class LabWork167 {
    public static void main(String[] args){
//        int[][] array = {{1, 1, 1, 3, 4},
//                         {2, 1, 3, 1, 2},
//                         {2, 2, 3, 4, 1},
//                         {3, 3, 3, 1, 4}};

        int[][] array = {{1, 1, 1, 3, 4, 1, 1, 1},
                         {2, 4, 3, 7, 2},
                         {2, 2, 3, 4, 1, 1, 9},
                         {1, 3, 3, 0, 1, 1, 1, 8, 1, 1}};


        final int VALUE_TO_SEARCH_FOR = 1;

        for (int row = 0; row < array.length; row++) {
            int counterValueToSearchFor = 0;
            int indexOfTheLastFoundValue = 0;
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == VALUE_TO_SEARCH_FOR) {
                    counterValueToSearchFor++;
                    if (counterValueToSearchFor == 1) {
                        System.out.print("Line " + (row + 1) + ": [" + column);
                    }
                    if ((column - indexOfTheLastFoundValue) == 1 & counterValueToSearchFor != 1) {
                        if (column == array[row].length - 1) {
                            if (array[row][column-2] != VALUE_TO_SEARCH_FOR) {
                                System.out.print("," + column);
                            } else {
                                System.out.print("-" + column);
                            }
                        } else {
                            if (array[row][column + 1] == VALUE_TO_SEARCH_FOR) {
                            System.out.print("");
                            } else {
                                if (array[row][column-2] != VALUE_TO_SEARCH_FOR) {
                                System.out.print("," + column);
                                } else {
                                System.out.print("-" + column);
                                }
                            }
                        }
                    }
                    if ((column - indexOfTheLastFoundValue) > 1 & counterValueToSearchFor != 1) {
                            System.out.print("," + column);
                    }
                    indexOfTheLastFoundValue = column;
                }
            }
            if (counterValueToSearchFor != 0) {
                System.out.println("]");
            }
        }
    }
}