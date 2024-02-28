package collectionsDemo;
import java.util.*;


class Cricket{
	String name;
	float avg;
	int runs;
	public Cricket(String name, float avg, int runs) {
		super();
		this.name = name;
		this.avg = avg;
		this.runs = runs;
	}
	public String toString() {//. In general, the toString method returns a string that"textually represents" this object.
		                        //The result should be a concise but informative representation that is easy for a person to read.
		                         //It is recommended that all subclasses override this method.
	
		return name+" "+avg+" "+runs;
	}
	
}


public class LaunchCricket {
	public static void main(String args[])
	{
	       Cricket c1=new Cricket("Sachin",43.5f ,7000);
	       Cricket c2=new Cricket("Dhoni",45.3f ,5000);
	       Cricket c3=new Cricket("Virat",50.2f ,4000);
	       ArrayList al=new  ArrayList();
	        al.add(c1);
	        al.add(c2);
	        al.add(c3);
	        System.out.println(al.toString());
	        Collections.sort(al);
	
	}
}
