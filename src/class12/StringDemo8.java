package class12;

import javax.swing.text.html.HTMLDocument;

public class StringDemo8 {
    public static void main(String[] args) {
      String str="Jfddhhd  445546  #%^&&&";

      int counter=0;

      for (int i=0;i<str.length();i++){


          if(Character.isDigit(str.charAt(i))){

              counter++;
          }
      }
        System.out.println(counter);





    }
}
