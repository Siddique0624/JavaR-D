package collectionsDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.*;


class Cricket2  
{
	String name;
	float avg;
	int runs;
	public Cricket2(String name, float avg, int runs) {
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
	       Cricket2 c1=new Cricket2("Sachin",43.5f ,7000);
	       Cricket2 c2=new Cricket2("Dhoni",45.3f ,5000);
	       Cricket2 c3=new Cricket2("Virat",50.2f ,4000);
	       ArrayList al=new  ArrayList();
	        al.add(c1);
	        al.add(c2);
	        al.add(c3);
	        System.out.println(al.toString());
	         
	        Collections.sort(al, new Comparator(){

	        	@Override
	        	public int compare(Object x, Object y) {
	        		if( ((Cricket2)(x)).runs>((Cricket2)(y)).runs)
	        			return 1;
	        	else
	        	return -1;
	        	}

	         
	        });
	        System.out.println(al);
	       
	}
}
