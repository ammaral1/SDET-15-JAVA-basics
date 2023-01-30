package class15;

public class MethodPractic4 {

  int largeNumMethod(int a, int b){

    int largerNum;
      if(a>b){
         largerNum=a;
      }else{

        largerNum=b;
      }
      return largerNum;
  }
    public static void main(String[] args) {

      MethodPractic4 mp=new MethodPractic4();

      System.out.println( mp.largeNumMethod(10,6));



    }



  }

