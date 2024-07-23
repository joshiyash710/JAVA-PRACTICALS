import java.util.Scanner;

public class Practical3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mobile number :");
        String mob=sc.nextLine();
        System.out.println("Operator code :"+mob.substring(0,2));
        System.out.println("MSD code :"+mob.substring(2,5));
        System.out.println("Unique code :"+mob.substring(5,10));
        System.out.println("By 23DIT019");
        
    }
}
