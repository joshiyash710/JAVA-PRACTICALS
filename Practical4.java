import java.util.Scanner;

public class Practical4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String[] product_list={"Motor","Fan","Tube","Wire"};
        float[] rate={1000,1500,500,100,200};
        char dec;
        int cnt=0;
        float total=0.00f;
        float price1=0.00f;
        float price2=0.00f;
        float price3=0.00f;
        float price4=0.00f;
        float price5=0.00f;
        do{
        System.out.println("********Menu********");
        System.out.println("1. Purchase Motor");
        System.out.println("2. Purchase Fan");
        System.out.println("3. purchase Tube");
        System.out.println("4. Purchase Wire");
        System.out.println("5. Purchase Other items.");
        System.out.println("6. Generate bill.");
        System.out.println("********************");
        System.out.println("Enter your option :");
        int opt=sc.nextInt();
        switch(opt)
        {
            case 1 :
            cnt++;
           
            System.out.println("Enter the number of units of motor :");
            int unit=sc.nextInt();
            price1 = (rate[0]+((price1+(rate[0]*0.08f))))*unit;
            System.out.println("Total price is :"+price1);
            total+=price1;
            break;
            case 2 :
           
            System.out.println("Enter the number of units of fans :");
            int unit1=sc.nextInt();
            price2 = (rate[1]+((price2+(rate[1]*0.12f))))*unit1;
            System.out.println("Total price is :"+price2);
            total+=price2;
            break;
            case 3 :
            
            System.out.println("Enter the number of units of tubes :");
            int unit2=sc.nextInt();
            price3 = (rate[2]+((price3+(rate[2]*0.05f))))*unit2;
            System.out.println("Total price is :"+price3);
            total+=price3;
            break;
            case 4:
            
            System.out.println("Enter the number of units of wires :");
            int unit3=sc.nextInt();
            price4 = (rate[3]+((price4+(rate[3]*0.075f))))*unit3;
            System.out.println("Total price is :"+price4);
            total+=price4;
            break;
            case 5 :
            
            System.out.println("Enter the number of units  :");
            int unit4=sc.nextInt();
            price5 = (rate[4]+((price5+(rate[4]*0.03f))))*unit4;
            System.out.println("Total price is :"+price5);
            total+=price5;
            break;
            case 6:
            System.out.println("Total billing amount is :"+total);
            break;
        }
        System.out.println("Enter 'y' if you want to purchase more items or 'n' to exit..." );
        dec=sc.next().charAt(0);
    }while('y'==dec);
    System.out.println("By 23DIT019");
    }
    
}
