package collectionsDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Different_ways_to_print_in_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList al=new ArrayList();
   al.add(10);
   al.add(20);
   al.add(30);
   al.add(40);
   al.add(50);
   al.add(60);
   al.add(70);
  System.out.println(al);
  System.out.println("@@@@@@@@@@@@@@@@@@@");
  for(int i=0;i<=al.size()-1;i++) {
	  System.out.println(al.get(i));
  }
  
  System.out.println("################");
  
  Iterator itr=al.iterator();
  while(itr.hasNext()==true)
  {
	  System.out.println(itr.next());
  }
  System.out.println("$$$$$$$$$$$$$$$$$");
  ListIterator litr1=al.listIterator();
  while(litr1.hasNext()==true)
  {
	  System.out.println(litr1.next());
  }
  System.out.println("%%%%%%%%%%%%%%%%%%");
  ListIterator litr2=al.listIterator(al.size());
  while(litr2.hasPrevious()==true)
  {
	  System.out.println("previos index is "+litr2.previousIndex()+" value is " +litr2.previous());
  }
  System.out.println("@&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  for(Object x:al)
  {
	  System.out.println(x); 
  }
  
  
	}

}
