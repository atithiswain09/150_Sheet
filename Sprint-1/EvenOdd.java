
import java.util.*;
public class EvenOdd {
   public static String CheckEvenOdd(int num){
    // check first the number is 0 or less than 0
    if(num<=0){
        return "Invalid";
    }
    if(num>0&&num%2==0){
        return "evn";

    }
    else{
        return "odd";
    }
   } 


public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Your Number...");
      int num=sc.nextInt();
      
        System.out.println(CheckEvenOdd(num));



}
   
}
