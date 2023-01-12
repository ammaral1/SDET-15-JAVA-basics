package package2;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is weather Temperature?");
        int n=scan.nextInt();
        if (n>=35 && n<60){
            System.out.println("Hot weather");
        }
        else if (n<34 && n>=20){
            System.out.println("Nice weather");
        }
        else if (n<20 && n>=0){
            System.out.println("Cold weather");
        }
        else {
            System.out.println("The weather is out of range");
        }

    }
}
