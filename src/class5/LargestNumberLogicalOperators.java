package class5;

import java.util.Scanner;

public class LargestNumberLogicalOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter three numbers");
        double num1, num2, num3;
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();

        if (num1>num2 && num1>num3){
            System.out.println("The largest number is "+num1);
        }else if (num2>num1&& num2>num3)
        {
            System.out.println("the largest number is "+num2);
        }  else if (num3>num1 && num3>num2)
        {
            System.out.println("The largest number is "+num3);
        }
    }
}
