package class5;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("Enter a country");
        Scanner scan=new Scanner(System.in);
        String country=scan.next();

        //System.out.println(country.toLowerCase());
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");

        }
            {
            }
        }
}
