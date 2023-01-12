package package2;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your grade:");

        int n=scan.nextInt();

        if (n<=100 && n>90){
            System.out.println("A");
        }
        else if (n<=90 && n>50){
            System.out.println("B");
        }
        else if (n<50 && n>=0){
            System.out.println("F");
        }
        else {
            System.out.println("The number you entered is out of range");
        }

    }
}
