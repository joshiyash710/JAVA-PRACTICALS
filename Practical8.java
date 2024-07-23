
import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        fun(str);
        
    }
    public static void fun(String str)
    {
        String new_str="";
        for(int i=0;i<str.length();i++)
        {
            new_str=new_str+str.charAt(i)+str.charAt(i);
        }
        System.out.println(new_str);
        System.out.println("By 23DIT019");
    }
    
}
