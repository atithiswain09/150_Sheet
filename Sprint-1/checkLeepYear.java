import java.util.*;
public class checkLeepYear {
      public static String CheckYear(int Year){
        if(Year==0||Year<0){
            return "InvalidYear";
        }
        if(Year%4==0&&(Year%400==0||Year%100!=0)){
            return "Leap Year";
        }
        return "Not a Leap Year";
      }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Your Year");
          int Year=sc.nextInt(); 
           System.out.println(CheckYear(Year));
    }
}
