import java.util.Scanner;
class employee
{
    String first_name;
    String last_name;
    double salary;
    Scanner sc=new Scanner(System.in);
    public employee()
    {
        first_name="NULL";
        last_name="NULL";
        salary=0.0f;
    }
    public void getFirstname()
    {
        System.out.println("Employee's first name is :"+first_name);
    }
    public void getLastname()
    {
        System.out.println("Employee's last name is :"+last_name);
    }
    public void getSalary()
    {
        System.out.println("Employee's salary is :"+salary);
    }
    public void setFirstname()
    {
        System.out.println("Enter the first name of an employee :");
        first_name=sc.nextLine();
    }
    public void setLastname()
    {
        System.out.println("Enter the last name of an employee :");
        last_name=sc.next();
    }
    public void setSalary()
    {
        System.out.println("Enter the salary of an employee :");
        salary=sc.nextDouble();
    }
    public void salarycheck()
    {
        if(salary<0.0)
        {
          salary=0.0;
        }
    }
    public void salaryraise()
    {
        salary+=(salary*0.1);
        double yearly_salary=salary*12.0;
        System.out.println("Employee's yearly salary is :"+yearly_salary);
    }
    
}
public class Practical13 {
    public static void main(String[] args) {
        employee e=new employee();
        employee e1=new employee();
        e.setFirstname();
        e.setLastname();
        e.setSalary();
        e.salarycheck();
        e.salaryraise();
        e.getFirstname();
        e.getLastname();
        e.getSalary();
        e1.setFirstname();
        e1.setLastname();
        e1.setSalary();
        e1.salarycheck();
        e1.salaryraise();
        e1.getFirstname();
        e1.getLastname();
        e1.getSalary();
    }




    
}
