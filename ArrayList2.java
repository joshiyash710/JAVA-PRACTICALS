import java.util.*;
public class ArrayList2 {
    public static void main(String[] args){
    ArrayList <Integer> al1=new ArrayList();
    ArrayList <Integer> al2=new ArrayList(List.of(50,60,70,80,90));
    al1.add(10);
    al1.add(0,5);
    al1.addAll(al2);
    System.out.println(al1);
    System.out.println("\n");
    System.out.println(al1.contains(50));
    System.out.println("\n");
    for(int i=0;i<al1.size();i++)
    {
        System.out.println(al1.get(i));
    }
    System.out.println("\n");
    for(var x : al1)
    {
        System.out.println(x);
    }
    System.out.println("\n");
    Iterator<Integer> it=al1.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    System.out.println("\n");
    for(Iterator<Integer> it1=al1.iterator();it1.hasNext();)
    {
        System.out.println(it1.next());
    }
    System.out.println("\n");
    al1.forEach(n->System.out.println(n));
    System.out.println("\n");
    al1.forEach(n->show(n));
    }
    static void show(int n)
    {
        if(n>60)
        {
            System.out.println(n);
        }
    }

    
}
