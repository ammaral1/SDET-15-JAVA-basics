package class11;

public class Note2DArray3 {
    public static void main(String[] args) {
        int [][] matrix={{1,4,7}, {45,67,89}, {234,567,890,345,234}};

        for (int i=0;i< matrix.length;i++){

            for (int j=0;j<matrix[i].length;j++){

                if (matrix[i][j]%2==0){
                    System.out.print(matrix[i][j]+" ");

                }


            }
            System.out.println();
        }



        }
    }
