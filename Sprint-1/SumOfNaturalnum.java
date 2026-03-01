import java.util.*;
public class SumOfNaturalnum {
      
    public static int CountSum(int num){
        if(num==0||num<0){
            return 0;
        }
        int Sum=0;
        for(int i=0;i<=num;i++){
            Sum=Sum+i;
        }
        return Sum;
    }


    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Number..");
           int Num=sc.nextInt();
           System.out.println(CountSum(Num));
    }
}
