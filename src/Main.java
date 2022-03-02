public class Main {
    public static void main(String[] args)
    {
        System.out.println("Array1 Test ----------");

        int[][] array1 = {{1, 2, 3},
                          {1, 4, 6}};
        System.out.println("Actual Result: " + findDuplicates(array1));
        System.out.println("Expected Result: true");

        System.out.println();
        System.out.println("Array2 Test ----------");

        int[][] array2 = {{1, 2, 3},
                          {4, 5, 6}};
        System.out.println("Actual Result: " + findDuplicates(array2));
        System.out.println("Expected Result: false");

        System.out.println();
        System.out.println("Array3 Test ----------");

        int[][] array3 = {{1, 3, 5},
                          {7, 9, 1},
                          {3, 5, 7},
                          {9, 1, 3}};
        System.out.println("Actual Result: " + findDuplicates(array3));
        System.out.println("Expected Result: false");

        System.out.println();
        System.out.println("Array4 Test ----------");

        int[][] array4 = {{1, 3, 5},
                          {7, 9, 1},
                          {3, 5, 7},
                          {9, 1, 3},
                          {5, 7, 9},
                          {1, 3, 5}};
        System.out.println("Actual Result: " + findDuplicates(array4));
        System.out.println("Expected Result: true");

        System.out.println();
        System.out.println("Array5 Test ----------");

        int[][] array5 = {{1, 3, 6},
                          {7, 9, 1},
                          {0, 6, 7},
                          {3, 8, 3},
                          {5, 5, 9},
                          {2, 1, 5}};
        System.out.println("Actual Result: " + findDuplicates(array5));
        System.out.println("Expected Result: false");
    }

    public static boolean findDuplicates(int[][] twoDimensionalArray)
    {
        for (int i = 0; i < twoDimensionalArray[0].length; i++)
        {
            for (int j = 0; j < twoDimensionalArray.length; j++)
            {
                for (int k = j + 1; k < twoDimensionalArray.length; k++)
                {
                    if (twoDimensionalArray[j][i] == twoDimensionalArray[k][i])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
