package class11;

import java.util.Arrays;

public class Note2DArray2 {
    public static void main(String[] args) {
        int [][] matrix={{1,4,7}, {45,67,89}, {234,567,890,345,234}};

        for (int i=0;i< matrix.length;i++){

            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }



        }
    }
