package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

       /* System.out.println("Please enter your age");
        int age=scanner.nextInt();

        *//*System.out.println("your are "+age +" years old");
        System.out.println("Please enter your weight");
        double weight=scanner.nextDouble();
        System.out.println("your weight is "+weight+ "pound");
        System.out.println("Are you hungry");
        boolean hungry=scanner.nextBoolean();
        System.out.println("you are hungry");
        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(0);*/
        System.out.println("please enter your name");
        String name=scanner.next();
        System.out.println("your name is "+name);

        scanner.nextLine();

        System.out.println("Please enter your full name ");
        String fullName=scanner.nextLine();
        System.out.println("your full name is "+fullName);




    }
}
