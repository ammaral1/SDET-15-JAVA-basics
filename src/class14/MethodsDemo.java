package class14;

import java.util.Scanner;

public class MethodsDemo {
    void printHello(){

        System.out.println("Hello world");
    }
    void printHelloManyTimes(int times){
        for (int i=0;i<times;i++){
            System.out.println("hello");
        }
    }

    void printManyTimes(int times, String word){
        for (int i=0;i<times;i++){

            System.out.println(word);
        }


    }
}