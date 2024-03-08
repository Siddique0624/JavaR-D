package collectionsDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.*;


class Cricket201  
{
	String name;
	float avg;
	int runs;
	public Cricket201(String name, float avg, int runs) {
		super();
		this.name = name;
		this.avg = avg;
		this.runs = runs;
	}
	public String toString() {
	
		return name+" "+avg+" "+runs;
	}
 }

 


public class  LaunchCricketrAnonymosclass   {
	public static void main (String args[])
	{
	       Cricket201 c1=new Cricket201("Sachin",43.5f ,7000);
	       Cricket201 c2=new Cricket201("Dhoni",45.3f ,5000);
	       Cricket201 c3=new Cricket201("Virat",50.2f ,4000);
	       ArrayList al=new  ArrayList();
	        al.add(c1);
	        al.add(c2);
	        al.add(c3);
	        System.out.println(al.toString());
	         
	        Collections.sort(al, new Comparator(){

	        	@Override
	        	public int compare(Object x, Object y) {
	        		if( ((Cricket201)(x)).runs>((Cricket201)(y)).runs)
	        			return 1;
	        	else
	        	return -1;
	        	}

	         
	        });
	        System.out.println(al);
	       
	}
}
