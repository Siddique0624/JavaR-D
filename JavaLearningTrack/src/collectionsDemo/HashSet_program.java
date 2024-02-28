
package collectionsDemo;
import java.util.HashSet;

class HashSet_program {

	 
	public static void main(String args[])
	{
		 	HashSet  hs = new HashSet ();
		 	hs.add(100);
		 	hs.add(50);
		 	hs.add(150);
		 	hs.add(25);
		 	hs.add(75);
		 	hs.add(125);
		 	hs.add(175);
		 
 		System.out.println(hs);
		System.out.println(hs.hashCode());
 		 
	}
}
