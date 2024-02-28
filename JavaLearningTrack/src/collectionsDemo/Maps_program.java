package collectionsDemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.lang.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


class cricket6  
{
	String name;
	float avg;
	int runs;
	int wicket;
	int catches;
	public cricket6(String name, float avg, int runs,int wicket,int catches) {
		super();
		this.name = name;
		this.avg = avg;
		this.runs = runs;
		this.wicket = wicket;
		this.catches = catches;
	}
	
	public String toString() {
	
		return name+" "+avg+" "+runs+" "+catches+" "+wicket;
	}
 }

 


public class  Maps_program   {
	public static void main (String args[])
	{
	       cricket6 c1=new cricket6("Sachin",43.5f ,7000,20,110);
	       cricket6 c2=new cricket6("Dhoni",45.3f ,5000,30,200);
	       cricket6 c3=new cricket6("Virat",50.2f ,4000,40,500);
	       ArrayList al=new  ArrayList();
	        al.add(c1);
	        al.add(c2);
	        al.add(c3);
	        System.out.println(al.toString());
	         
	        Collections.sort(al, new Comparator(){

	        	@Override
	        	public int compare(Object x, Object y) {
	        		if( ((cricket6)(x)).runs>((cricket6)(y)).runs)
	        			return 1;
	        	else
	        	return -1;
	        	}

	         
	        });
	        System.out.println(al);
	       HashMap hs=new HashMap();
	       hs.put(10, c1);
	       hs.put(20, c2);
	       hs.put(30, c3);
	       System.out.println("To assign keys");
	       System.out.println(hs);
	       
	      Set s=hs.keySet();
	      Iterator itr=s.iterator();
	      while (itr.hasNext()==true) {
	    	  System.out.println(itr.next());
	      }

    	  System.out.println("To print values");
    	  Collection c=hs.values();
    	  Iterator itr1=c.iterator();
	      while (itr1.hasNext()==true) {
	    	  System.out.println(itr1.next());
	      }
	      System.out.println("To print values and keys together"); 
	      
	      Set s1=hs.entrySet();
    	  Iterator itr2=s1.iterator();
	      while (itr2.hasNext()==true) {
	    	  System.out.println(itr2.next());
	      }
	      
	      
	}
}
//[Sachin 43.5 7000 110 20, Dhoni 45.3 5000 200 30, Virat 50.2 4000 500 40]
/*[Virat 50.2 4000 500 40, Dhoni 45.3 5000 200 30, Sachin 43.5 7000 110 20]
To assign keys
{20=Dhoni 45.3 5000 200 30, 10=Sachin 43.5 7000 110 20, 30=Virat 50.2 4000 500 40}
20
10
30
To print values
Dhoni 45.3 5000 200 30
Sachin 43.5 7000 110 20
Virat 50.2 4000 500 40
To print values and keys together
20=Dhoni 45.3 5000 200 30
10=Sachin 43.5 7000 110 20
30=Virat 50.2 4000 500 40*/