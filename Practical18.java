import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    int area, perimeter;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setArea() {
        area = length * breadth;
    }

    public void getArea() {
        System.out.println("Area :" + area);
    }

    public void setPerimeter() {
        perimeter = 2 * (length + breadth);
    }

    public void getPerimeter() {
        System.out.println("Perimeter :" + perimeter);
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

public class Practical18 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int l, b;
        System.out.println("Enter the length and breadth of rectangle :");
        l = sc2.nextInt();
        b = sc2.nextInt();
        Rectangle r = new Rectangle(l, b);
        r.setArea();
        r.getArea();
        r.setPerimeter();
        r.getPerimeter();
        System.out.println("Enter the side :");
        int side = sc2.nextInt();
        Square s = new Square(side);
        s.setArea();
        s.getArea();
        s.setPerimeter();
        s.getPerimeter();
        int size;
        System.out.println("Enter the number of rectangles :");
        size = sc2.nextInt();
        Rectangle[] r1 = new Rectangle[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the length and breadth of rectangle :");
            int  l1 = sc2.nextInt();
            int  b1=sc2.nextInt();
            r1[i] = new Rectangle(l1,b1);
            r1[i].setArea();
            r1[i].getArea();
            r1[i].setPerimeter();
            r1[i].getPerimeter();
        }
        System.out.println("Enter the number of squares :");
        int size1 = sc2.nextInt();
        Square[] s1 = new Square[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter the side :");
            s1[i] = new Square(sc2.nextInt());
            s1[i].setArea();
            s1[i].getArea();
            s1[i].setPerimeter();
            s1[i].getPerimeter();
        }
        System.out.println("By 23DIT019");
    }
}
