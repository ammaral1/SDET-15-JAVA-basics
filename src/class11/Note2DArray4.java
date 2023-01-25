package class11;

public class Note2DArray4 {
    public static void main(String[] args) {
        int [][] matrix={{1,4,7}, {45,67,89}, {234,567,890,345,234}};

        for (int [] x: matrix){
            for (int arr: x){
                System.out.print(arr+" ");

            }
            System.out.println();
        }



        }
    }
