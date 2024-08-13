
import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        ArrayDeque<Integer> dq1=new ArrayDeque<>();
        ArrayDeque<Integer> dq2=new ArrayDeque<>();
        ArrayDeque<Integer> dq3=new ArrayDeque<>();
        //making deque behave as stack
        System.out.println("Deque as stack :");
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerFirst(30);
        dq.offerFirst(40);
        dq.offerFirst(50);
        dq.pollFirst();
        dq.forEach((x)->System.out.println(x));
        System.out.println("\n");
        dq1.offerLast(1);
        dq1.offerLast(2);
        dq1.offerLast(3);
        dq1.offerLast(4);
        dq1.offerLast(5);
        dq1.pollFirst();
        dq1.forEach((x)->System.out.println(x));
        System.out.println("\n");
        System.out.println("Deque as Queue :");
        dq2.offerLast(100);
        dq2.offerLast(200);
        dq2.offerLast(300);
        dq2.offerLast(400);
        dq2.offerLast(500);
        dq2.pollFirst();
        dq2.forEach((x)->System.out.println(x));
        System.out.println("\n");
        dq3.offerFirst(600);
        dq3.offerFirst(700);
        dq3.offerFirst(800);
        dq3.offerFirst(900);
        dq3.offerFirst(1000);
        dq3.pollLast();
        dq3.forEach((x)->System.out.println(x));
    }
    
}
