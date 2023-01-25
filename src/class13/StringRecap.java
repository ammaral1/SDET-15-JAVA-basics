package class13;

public class StringRecap {
    public static void main(String[] args) {
        String str="Java is Great";
int counter=0;
        for (int i=0;i<str.length();i++){


            if (str.charAt(i)=='a'){
                counter=counter +1;


            }
        }
        System.out.println(counter);
    }
}
