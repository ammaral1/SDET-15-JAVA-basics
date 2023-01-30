package class15;

public class MethodPractic6 {

  String createEmail(String name, String lastName, String emailType){
    return name+lastName+"@"+emailType+".com";

  }
public static void main(String[] args){

    MethodPractic6 email=new MethodPractic6();

  System.out.println(email.createEmail("Ammar", "Alqaraghuli", "gmail").toLowerCase());
}
  }

