import java.util.Scanner;

class Complex
{
    float real,complex;
    Complex()
    {
        real=0.0f;
        complex=0.0f;
    }
    public Complex add(Complex c)
    {
        Complex temp=new Complex();
        temp.real=c.real+this.real;
        temp.complex=c.complex+this.complex;
        return temp;
    }
    public Complex sub(Complex c)
    {
        Complex temp=new Complex();
        temp.real=c.real-this.real;
        temp.complex=c.complex-this.complex;
        return temp;
    }
    public Complex mul(Complex c)
    {
        Complex temp=new Complex();
        temp.real=(c.real*this.real)-(c.complex*this.complex);
        temp.complex=(c.real*this.complex)+(c.complex*this.real);
        return temp;
    }
    public void display()
    {
        System.out.println(this.real+" + "+this.complex+" i");
    }
}
public class Practical16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex c1=new Complex();
        System.out.println("Enter the complex number 1 :");
        c1.real=sc.nextFloat();
        c1.complex=sc.nextFloat();
        Complex c2=new Complex();
        System.out.println("Enter the complex number 2 :");
        c2.real=sc.nextFloat();
        c2.complex=sc.nextFloat();
        Complex c3=c1.add(c2);
        Complex c4=c1.sub(c2);
        Complex c5=c1.mul(c2);
        int opt;
        do{
            System.out.println("::::::::MENU::::::::");
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLY");
            System.out.println("4. EXIT");
            System.out.println("::::::::::::::::::::");
            System.out.println("Enter your choice :");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                System.out.println("Addition of complex numbers : ");
                c3.display();
                break;
                case 2:
                System.out.println("Subtraction of complex numbers : ");
                c4.display();
                break;
                case 3:
                System.out.println("Multiplication of complex numbers : ");
                c5.display();
                break;
                case 4:
                break;
            }
        }while(opt!=4);
        System.out.println("By 23DIT019");

    }
}
