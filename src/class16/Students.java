package class16;

import java.util.Scanner;

public class Students {

    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students st1=new Students();
        st1.name="Ammar";
        st1.ID="1S";
        st1.numberOfStudents++;
        System.out.println(st1.name);
        System.out.println(st1.ID);
        System.out.println(st1.numberOfStudents);


        Students st2=new Students();
        st2.name="Ali";
        st2.ID="2S";
        st2.numberOfStudents++;
        System.out.println(st2.name);
        System.out.println(st2.ID);
        System.out.println(st2.numberOfStudents);

        Scanner scan=new Scanner(System.in);
        scan.next();

    }
}
