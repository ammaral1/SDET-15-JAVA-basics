package class11;

import java.util.Arrays;

public class Note2DArray {
    public static void main(String[] args) {
        int [][] matrix={{1,4,7}, {45,67,89}, {234,567,890,345,234}};




        System.out.println(Arrays.toString(matrix[0]));

        for (int i=0;i<matrix[2].length;i++){

            System.out.println(matrix[2][i]);
        }
    }
}
