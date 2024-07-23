import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int size;
        
         System.out.println("Enter the size of the array :");
         size=sc.nextInt();
         int[] arr=new int[size]; 
         int cnt=0;
         for(int i=0;i<size;i++)
         {
            arr[i]=sc.nextInt();
         }
         for(int i=0;i<size;i++)
         {
            if(arr[i]==9)
            {
                cnt++;
            }
         }
         System.out.println("9 appears "+cnt+" times in the given array.");     
         System.out.println("By 23DIT019");  
    }
    
}
