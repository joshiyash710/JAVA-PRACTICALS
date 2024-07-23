import java.util.Arrays;
import java.util.Scanner;
public class Practical10 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String str;
       System.out.println("Enter the string :");
       str=sc.nextLine();
       int option;
       do { 
           System.out.println("::::::::MENU::::::::");
           System.out.println("1. LENGTH ");
           System.out.println("2. TO UPPERCASE ");
           System.out.println("3. TO LOWERCASE ");
           System.out.println("4. REVERSE ");
           System.out.println("5. SORT");
           System.out.println("6. EXIT");
           System.out.println("::::::::::::::::::::");
           System.out.println("Enter your choice :");
           option=sc.nextInt();
           switch(option)
           {
            case 1:
            int cnt=0;
            try{
            while(str.charAt(cnt)!='\0')
            {
                cnt++;
            }
          
            }
        catch(StringIndexOutOfBoundsException e)
        {

        }
        System.out.println("Length of string is :"+cnt);
            
        System.out.println("Length of string using function is :"+str.length());
        break;
            case 2 :
            System.out.println("String in uppercase :"+str.toUpperCase());
            String upper="";
            for(int i=0;i<str.length();i++)
            {
                int ch=str.charAt(i);
                if(ch>=92 && ch<=122)
                {
                    ch-=32;
                    upper+=(char)ch;
                }
                else
                {
                    upper=str;
                    break;
                }
            }
            System.out.println("String in uppercase (manually) :"+upper);
            break;
            case 3:
            System.out.println("String in lowercase :"+str.toLowerCase());
            String lower="";
            for(int i=0;i<str.length();i++)
            {
                int low=str.charAt(i);
                if(low>=65 && low<=90)
                {
                    low+=32;
                    lower+=(char)low;
                }
                else
                {
                    lower=str;
                    break;
                }
            }
            System.out.println("String in lower manually :"+lower);
            break;
            case 4:
            char ch2;
            String rev=" ";
            for(int i=str.length()-1;i>=0;i--)
            {
                ch2=str.charAt(i);
                rev+=ch2;
            }
            System.out.println("Reversed string is :"+rev);
            break;
            case 5:
            char ch1[]=new char[str.length()];
            for(int i=0;i<str.length();i++)
            {
                ch1[i]=str.charAt(i);
            }
            Arrays.sort(ch1);
            String str1="";
            for(int i=0;i<str.length();i++)
            {
                str1+=ch1[i];
            }
            System.out.println(str1);
            case 6:
            break;
           }
       } while (option!=6);
       System.out.println("By 23DIT019");
       
    }
    
}
