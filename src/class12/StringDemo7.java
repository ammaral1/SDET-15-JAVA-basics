package class12;

public class StringDemo7 {
    public static void main(String[] args) {
      String str="Java is love";
    char character=str.charAt(2);

        System.out.println(character);

        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));

        }
        int counter=0;
        for (int j=0;j<str.length();j++){
            if (str.charAt(j)=='a'){
                counter++;

            }



        }
        System.out.println();
        System.out.println(counter);








    }
}
