package collectionsDemo;
import java.util.LinkedList;

public class Linkedlist_program_stack {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();//creating an linked list
		
       l.push(10);
       l.push(20);
       l.push(30);
       l.push(40);
       l.push(50);
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);

		
	}
}