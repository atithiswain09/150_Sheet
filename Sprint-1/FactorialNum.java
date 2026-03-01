
import java.util.*;;

public class FactorialNum {
    public static int CheckFact(int num) {
        // Base case
        if (num == 0 || num < 1) {
            return 1;
        }
        int ans= num*CheckFact(num-1);

       return ans;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number..");
         int num=sc.nextInt();
         System.out.println(CheckFact(num));
    }
}
