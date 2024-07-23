import java.util.Scanner;
public class Practical6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String name=sc.nextLine();
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        fun(name,number);
    }
    public static void fun(String name,int number)
    {
        if(number==name.length())
        {
            for(int i=0;i<number;i++)
            {
                System.out.println(name);
            }
        }
        else if(number<name.length())
        {
            for(int i=0;i<number;i++)
            {
            System.out.println(name.substring(0,number));
            }
        }
        else if(number>name.length())
        {
            for(int i=0;i<number;i++)
            {
            System.out.println(name+name.substring(0,number-name.length()));
            }
        }
        System.out.println("By 23DIT019");
    }
    
}
