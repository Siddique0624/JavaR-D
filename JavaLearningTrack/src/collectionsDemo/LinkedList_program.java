package collectionsDemo;
import java.util.LinkedList;

public class LinkedList_program {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();//creating an linked list
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		l.add(1, 15);
		System.out.println(l);
        l.addFirst(5);
        l.addLast(55);

		System.out.println(l);

		System.out.println(l.getFirst());

		System.out.println(l.getLast());

		System.out.println(l.peek());

		System.out.println(l);

		System.out.println(l.poll());

		System.out.println(l);
		l.removeFirst();
		l.removeLast();

		System.out.println(l);
	
	}
}