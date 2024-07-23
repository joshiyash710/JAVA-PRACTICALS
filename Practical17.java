import java.util.Scanner;
class Member{
    String name;
    int age;
    String phone;
    String address;
    double salary;
    Scanner sc=new Scanner(System.in);
public Member()
{
    name="NULL";
    age=0;
    phone="NULL";
    address="NULL";
    salary=0.0;
}
public void setName()
{
   System.out.println("Enter the name :");
   name=sc.nextLine();
}
public void setAge()
{
    System.out.println("Enter the age :");
    age=sc.nextInt();
}
public void setPhone()
{
    sc.nextLine();
    System.out.println("Enter the phone :");

    phone=sc.nextLine();
}
public void setAddress()
{
    System.out.println("Enter the address :");
    address=sc.nextLine();
}
public void setSalary()
{
    System.out.println("Enter the salary :");
    salary=sc.nextDouble();
}
public void getName()
{
    System.out.println("Name :"+name);
}
public void getAge()
{
    System.out.println("Age :"+age);
}
public void getPhone()
{
    System.out.println("Phone :"+phone);
}
public void getAddress()
{
    System.out.println("Address :"+address);
}
public void getSalary()
{
    System.out.println("Salary :"+salary);
}

public void printSalary()
{
    System.out.println(salary);
}
}
class Employee extends Member{
    String specialization;
    public void fromMembertoEmployee(){
   setName();
    setAge();
    setPhone();
    setAddress();
    setSalary();
    System.out.println("::::::::EMPLOYEE DETAILS:::::::::");
    getName();
    getAge();
    getPhone();
    System.out.println(":::::::::::::::::::::::::::::::::::::::");
    }
    public void setSpecialization()
    {
        System.out.println("Enter the specialization :");
        specialization=sc.nextLine();
    }
    public void getSpecialization()
    {
        System.out.println("Specialization : "+specialization);
    }
}
class Manager extends Member{
    String department;
    public void fromMembertoManager(){
        setName();
         setAge();
         setPhone();
         setAddress();
         setSalary();
         System.out.println("::::::::MANAGER DETAILS:::::::::");
         getName();
         getAge();
         getPhone();
         System.out.println(":::::::::::::::::::::::::::::::::::::::");
         }
    public void setDepartment()
    {
        System.out.println("Enter the department :");
        department=sc.nextLine();
    }
    public void getDepartment()
    {
        System.out.println("Department : "+department);
    }
}
public class Practical17 {
    public static void main(String[] args)
    {
        Employee e=new Employee();
        Manager m=new Manager();
        int opt;
        Scanner sc1=new Scanner(System.in);
        do { 
            System.out.println("::::::::::MENU::::::::::");
            System.out.println("1. Employee Details");
            System.out.println("2. Manager Details");
            System.out.println("3. Exit");
            System.out.println("::::::::::::::::::::::::::");
            System.out.println("Enter your choice :");
            opt=sc1.nextInt();
            switch(opt)
            {
                case 1:
                e.fromMembertoEmployee();
                e.setSpecialization();
                
                e.getSpecialization();
                
                break;
                case 2:
                m.fromMembertoManager();
                m.setDepartment();
                
                m.getDepartment();
               
                break;
                case 3:
                System.out.println("Thank you for using our services");
                break;

            }

        } while (opt!=3);

    }
}