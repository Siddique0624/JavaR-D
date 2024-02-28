package collectionsDemo;
import java.util.ArrayList;
import java.util.Collections;



class Cricket1 implements Comparable
{
	String name;
	float avg;
	int runs;
	public Cricket1(String name, float avg, int runs) {
		super();
		this.name = name;
		this.avg = avg;
		this.runs = runs;
	}
	public String toString() {
	
		return name+" "+avg+" "+runs;
	}
	@Override
	public int compareTo(Object x) { 
		if(this.runs>((Cricket1)(x)).runs)
				return 1;
		else
		return -1;
	}
	
}
public class LaunchCricket1 {
	public static void main(String args[])
	{
	       Cricket1 c1=new Cricket1("Sachin",43.5f ,7000);
	       Cricket1 c2=new Cricket1("Dhoni",45.3f ,15000);
	       Cricket1 c3=new Cricket1("Virat",50.2f ,4000);
	       ArrayList al=new  ArrayList();
	        al.add(c1);
	        al.add(c2);
	        al.add(c3);
	      //  System.out.println(al.toString());
	        System.out.println(al);//added to check
	        Collections.sort(al);
	        System.out.println(al);
	
	}
}
