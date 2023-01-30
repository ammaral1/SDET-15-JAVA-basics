package class16;

public class SyntaxEmployee {
    int empID;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee employee1=new SyntaxEmployee();

        employee1.empID=1;
        employee1.salary=100000;
        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        System.out.println(employee1.CEO);

        SyntaxEmployee employee2=new SyntaxEmployee();

        employee2.empID=2;
        employee2.salary=30000;
        System.out.println(employee2.salary);
        System.out.println(employee2.CEO);

    }





}
