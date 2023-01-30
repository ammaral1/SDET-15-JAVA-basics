package class16;

public class task4 {

    String sayHello(String countryName) {

        switch (countryName) {

            case "USA":
                return "Hello";
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }

    public static void main(String[] args) {

        task4 obj=new task4();
        System.out.println(obj.sayHello("jhjjh"));



    }


}
