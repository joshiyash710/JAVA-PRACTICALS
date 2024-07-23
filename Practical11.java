import java.util.Scanner;

public class Practical11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,name;
        System.out.println("Enter the string :");
        str=sc.nextLine();
        int option;
        do { 
           System.out.println(":::::::::::::::::::::MENU::::::::::::::::::::::::");
           System.out.println("1. LENGTH ");
           System.out.println("2. REPLACE 'H' WITH FIRST LETTER OF NAME ");
           System.out.println("3. TO LOWERCASE ");
           System.out.println("4. EXIT");
           System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
           System.out.println("Enter your choice :");
           option=sc.nextInt();
           switch(option)
           {
            case 1 :
            System.out.println("Length of the string is :"+str.length());
            break;
            case 2:
          
            try{
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter your name :");
            name=sc1.nextLine();
            for(int i=0;i<str.length();i++)
             {
             if(str.charAt(i)=='H')
             {
             str= str.replace('H',name.charAt(0));
             }              
             }
             System.out.println("Changed string is :"+str);
            }
            catch(StringIndexOutOfBoundsException e)
            {

            }
            break;
            case 3:
            System.out.println("String in lowercase :"+str.toLowerCase());
            break;
            case 4:
            break;
           }
        } while (option!=4);
        System.out.println("By 23DIT019");
    }
    
}
