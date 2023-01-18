package class10;

public class TwoDArray2 {
    public static void main(String[] args) {

        int [][] matrix={{10, 34, 56},
                {34, 55, 78,36, 88},
                {22,5,1,8}
        };
for (int i=0;i< matrix.length;i++){
    for (int j=0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j]+" ");


    }
    System.out.println();

}
    }
}
