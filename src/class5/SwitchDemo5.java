package class5;

public class SwitchDemo5 {
    public static void main(String[] args) {
        char gender='f';
// if we dont use break then we can have more choices to print out one thing
        switch (gender){
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified ");

        }
    }
}
