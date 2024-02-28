
package collectionsDemo;
import java.util.*;

class CollectionApplication2 {

	 
	public static void main(String args[])
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add(50);
		ad.add(30);
		ad.add(40);
		ad.add(10);
		ad.add(20);
		ArrayList al=new ArrayList();
		al.addAll(ad);
		Collections.sort(al);
		System.out.println(al);   
	
	}
}
