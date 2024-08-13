import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> li=new ArrayList<Integer>();
        //adding in arraylist
        li.add(0);
        li.add(2);
        li.add(3);
        System.out.println(li);
        // adding at particular index
        li.add(1,1);
        System.out.println(li);
        //looping in arraylist and getting a particular element from arraylist
        for(int i=0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }
        //setting a particular a value at a particular index by replacement
        li.set(0,5);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        //deleting a particular element at a given index in the arraylist
        li.remove(3);
        System.out.println(li);


    }
    
}
