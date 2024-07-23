import java.util.Scanner;
class Area
{
    int length;
    int breadth;
    Scanner sc=new Scanner(System.in);
    public Area(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int returnArea()
    {
       double area;
       area=length*breadth;
       return (int)area;
    }
}
public class Practical15 {
    public static void main(String[] args) {
        int length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        length=sc.nextInt();
        breadth=sc.nextInt();
       Area ar=new Area(length,breadth);
       System.out.println("Area of rectangle is :"+ar.returnArea());
       System.out.println("By 23DIT019");
    }

}