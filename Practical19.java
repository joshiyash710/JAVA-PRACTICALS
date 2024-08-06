class Shape{
    void print_shape()
    {
        System.out.println("This is This is shape.");
    }
}
class Rectangle extends Shape{
    void print_rectangle()
    {
        System.out.println("This is rectangle shape.");
    }
}
class Cicrlce extends Shape{
    void print_circle()
    {
        System.out.println("This is a circular shape.");
    }
}
class Square extends Rectangle{
    void print_square(){
        System.out.println("Square is a Rectangle.");
    }
}
public class Practical19 {
    public static void main(String[] args) {
        Square s=new Square();
        s.print_rectangle();
        s.print_shape();
    }
}
