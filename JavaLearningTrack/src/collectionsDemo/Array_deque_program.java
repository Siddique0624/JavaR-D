
package collectionsDemo;
import java.util.ArrayDeque;

public class Array_deque_program {
	public static void main(String[] args) {
      ArrayDeque ad=new ArrayDeque();
      ad.add(10);
      ad.add(20);
      ad.add(30);
      ad.add(40);
      ad.add(50);
      System.out.println(ad);
      ad.addFirst(5);
      ad.addLast(55);
      System.out.println(ad.getFirst());
      System.out.println(ad.getLast());
      System.out.println(ad.getClass());
      
      
      
      
	}
}