package class5;

import java.util.Scanner;

public class NestedIfPractise1 {
    public static void main(String[] args) {
        int number1, number2, number3;
        System.out.println("please enter 3 numbers ");
        Scanner scan=new Scanner(System.in);

        number1=scan.nextInt();
        number2=scan.nextInt();
        number3=scan.nextInt();
        System.out.println("number one is "+number1+ " then number 2 is "+number2+" then number three is "+number3);

        if (number1>number2){
            if (number1>number3){
                System.out.println(number1+" is the greatest number");
            }
        }
        if (number2>number1){
            if (number2>number3){
                System.out.println(number2+" is the greatest number");
            }
        }
        if (number3>number2){
            if (number3>number1){
                System.out.println(number3+" is the greatest number");
            }
        }



    }
}
