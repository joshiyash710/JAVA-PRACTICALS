import java.util.Random;
import java.util.Scanner;
public class Practical5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int user_input;
        int random;
       int n=0;
       random=r.nextInt(100);
       System.out.println(random);
        do{
           System.out.println("Enter your guess :");
           user_input=sc.nextInt();
           if(user_input==random)
           {
               System.out.println("Your guess is correct !!!");
           }
           else if(user_input<(random/2))
           {
            System.out.println("Your guess is too low.");
           }
           else if(user_input>(random/2))
           {
            System.out.println("Your guess is too high.");
           }
        }while(user_input!=random || n==5);

        System.out.println("Random input :"+random);   
        System.out.println("By 23DIT019");
    }
     
}
