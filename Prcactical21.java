import java.util.Scanner;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
public class Prcactical21 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        int n;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(calculator.divisor_sum(n));
    }
}
