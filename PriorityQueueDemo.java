import java.util.*;
class Mycom implements Comparator<Integer>
{
    public int compare(Integer a, Integer b){
        if(a>b) return -1;
        else if(a<b) return 1;
        return 0;
    }
}
public class PriorityQueueDemo {
    public static void main(String[] args) {
         PriorityQueue <Integer> pq=new PriorityQueue<>();
         PriorityQueue <Integer> pq1=new PriorityQueue<>(new Mycom());
         System.out.println("Min heap :");
         pq.add(10);
         pq.add(20);
         pq.add(15);
         pq.add(5);
         pq.add(30);
         System.out.println(pq.peek());
         System.out.println("\n");
         pq.forEach((x)->System.out.println(x));
         System.out.println("\n");
         System.out.println("Max heap :");
         pq1.add(10);
         pq1.add(20);
         pq1.add(15);
         pq1.add(5);
         pq1.add(30);
         System.out.println(pq1.peek());
         System.out.println("\n");
         pq1.forEach((x)->System.out.println(x));
    }
    
}
