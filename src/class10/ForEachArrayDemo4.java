package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachArrayDemo4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    int []arr=new int [5];
   /* arr [0]=40;
    arr [1]=50;
    arr [2]=60;
    arr [3]=70;
    arr [4]=80;*/
        for (int i=0; i<arr.length;i++){

            arr[i]=scan.nextInt();


        }


        System.out.println(Arrays.toString(arr));


        }

    }


