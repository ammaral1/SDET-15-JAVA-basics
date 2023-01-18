package class10;

public class ForEachArrayDemo2 {
    public static void main(String[] args) {
    int []arr={10, 13, 20, 25, 45, 50};

    for (int i=0; i<arr.length;i++){

        if (arr[i]%2 !=0){
            arr[i]=0;
        }

        }
    for (int x: arr){

        System.out.println(x);
    }

    }
    }

