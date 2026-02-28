
import java.util.*;
public class CheckPrime {
       
public static String CheckPrimeNum(int num){
    if(num<0||num==0){
     return "Invalid";
    }
      int check=0;
    for(int i=1;i<=num;i++){
     if(num%i==0){
        check++;
     }

    }
    if(check==2){
     return "prime";
    }
    else{
      return "Not Prime";
    }
}


public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Your Number..");
     int num=sc.nextInt();
      System.out.println(CheckPrimeNum(num));
}
}
