package class5;

public class IncrementOperatorDemo {
    public static void main(String[] args) {
        int number=10;
        number=number+1;
        System.out.println(number);
        number+=1;
        System.out.println(number);
        number++; // also increments the number by 1
        System.out.println(number);

        int number2=10;
        number2--;
        System.out.println(number2);

        int number3=5;
        System.out.println(number3);
        number3++;
        System.out.println(number3);
    }
}
