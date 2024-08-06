class Degree{
    void getDegree()
    {
        System.out.println("I got a degree.");
    }
}
class Undergraduate extends Degree{
    void print_under()
    {
        System.out.println("I am an undergraduate.");
    }
}
class Postgraduate extends Degree{
    void print_post()
    {
        System.out.println("I am a postgraduate.");
    }
}
public class Practical20 {
    public static void main(String[] args) {
        Degree d=new Degree();
        d.getDegree();
        Undergraduate u=new Undergraduate();
        u.print_under();
        Postgraduate p=new Postgraduate();
        p.print_post();

    }

    
}
