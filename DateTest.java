
import java.util.Scanner;

class Date{
    int month;
    int day;
    int year;
    Scanner sc=new Scanner(System.in);
    Date()
    {
        month=0;
        day=0;
        year=0;
    }
    public void setmonth()
    {
        System.out.println("Enter the month :");
        month=sc.nextInt();
    }
    public void setday()
    {
        System.out.println("Enter the day :");
        day=sc.nextInt();
    }
    public void setyear()
    {
        System.out.println("Enter the year :");
        year=sc.nextInt();
    }
    public void getmonth(){
        System.out.println("Month : "+month);
    }
    public void getday(){
        System.out.println("Day : "+day);
    }
    public void getyear(){
        System.out.println("Year : "+year);
    }
    public void display()
    {
        System.out.println("Date : "+month+"/"+day+"/"+year);
    }
}
public class DateTest {
    public static void main(String[] args)
    {
        Date d=new Date();
        d.setmonth();
        d.setday();
        d.setyear();
        d.getday();
        d.getmonth();
        d.getyear();
        d.display();
        System.out.println("By 23DIT019");
    }
    
}
