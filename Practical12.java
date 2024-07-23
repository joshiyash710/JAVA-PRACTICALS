import java.util.Scanner;

public class Practical12 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int rupees;
       int pounds;
       int option;
       do { 
           System.out.println("::::::::MENU::::::::");
           System.out.println("1. Rupees to pounds.");
           System.out.println("2. Pound to rupees.");
           System.out.println("3. EXIT");
           System.out.println("::::::::::::::::::::::");
           System.out.println("Enter the option :");
           option=sc.nextInt();
           switch(option)
           {
            case 1 :
            System.out.println("Enter the amount in rupees :");
            rupees=sc.nextInt();
            pounds=rupees*100;
            System.out.println("Amount in pounds :"+pounds);
            break; 
           case 2 :
           System.out.println("Enter the amount in pounds :");
           pounds=sc.nextInt();
           rupees=pounds/100;
           System.out.println("Amount in rupees :"+rupees);
           break;
           case 3 :
           break;
           }
           
       } while (option!=3);
       System.out.println("By 23DIT019");
    }
}
