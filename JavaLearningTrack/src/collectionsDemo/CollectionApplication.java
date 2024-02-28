
package collectionsDemo;
import java.util.*;

class CollectionApplication {

	 
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(50);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(20);
		Collections.sort(al);
		System.out.println(al);
      ListIterator litr=al.listIterator(al.size());
      while(litr.hasPrevious()==true) {
    	  System.out.println(litr.previous());	  
      }
		
	}
}
