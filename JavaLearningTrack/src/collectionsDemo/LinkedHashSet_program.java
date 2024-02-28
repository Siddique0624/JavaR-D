
package collectionsDemo;
import java.util.LinkedHashSet;

class LinkedHashSet_program {

	 
	public static void main(String args[])
	{
		LinkedHashSet  lhs = new LinkedHashSet ();
		 	lhs.add(100);
		 	lhs.add(50);
		 	lhs.add(150);
		 	lhs.add(25);
		 	lhs.add(75);
		 	lhs.add(125);
		 	lhs.add(175);
		 
 		System.out.println(lhs);
		System.out.println(lhs.hashCode());
 		 
	}
}
