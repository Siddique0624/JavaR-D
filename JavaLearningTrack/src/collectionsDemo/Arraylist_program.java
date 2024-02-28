package collectionsDemo;

import java.util.ArrayList;
public class Arraylist_program {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();//creating an arraylist
al.add(10);//adding values to the array list
al.add(10.5);
al.add(true);
al.add('a');
al.add("BJS");
System.out.println(al);//printing the array list 
al.add(2, 60);//To add value at specific lcatin
System.out.println(al);
al.add(600);//If we directly use add to Arraylist it will by default added at the last
System.out.println(al);
ArrayList al1=new ArrayList();
al1.add(80);
al1.add(90);
al1.add(100);
System.out.println(al.addAll(al1));//addAll method is used to add all the array list available  true or false
System.out.println(al);
al.addAll(2, al1);
System.out.println(al);
System.out.println(al.contains(10));//to check weather AL contains the value
System.out.println(al.contains(20));//to check weather AL contains the value
System.out.println(al.containsAll(al1));//To check weather the al contains all the value that are in al1
al.ensureCapacity(20);//to fix the AL capacity to the required value
System.out.println(al.equals(al1));//To compare the al values are equal to al1 values
System.out.println(al.get(2));//To get the value at the specific index
System.out.println(al.getClass());//to know which classis being used
System.out.println(al.indexOf(new Integer(20)));//To know the index of the value
System.out.println(al.indexOf(new Integer(90)));//To know the index of the value
al.trimToSize();//to trim the size which in turn remove all the memory with empty values 
System.out.println(al.isEmpty());//To check weather the AL is empty
System.out.println(al.lastIndexOf(80));//It will return the index value of the number that has appeared in the last even though it has value in the begining	
al.remove(2);//to remove the value at prefered index
System.out.println(al);
al.remove(new Integer(100));//to remove the value directly without referring to index
System.out.println(al);
al.retainAll(al1);//to take back all the values of al1 from al
System.out.println(al);
al.set(2, 15);//To set the value at prefered index ,it will replace the old value at teh index with new value
System.out.println(al);
System.out.println(al.size());//To get the size of AL
System.out.println(al.subList(0, 3));//To limit the array list to preferred index,here if we mention from 0-3 it will take value from 0-2 only,same as array
Object a[]=al.toArray();//to convert the Al to array
System.out.println(a[2]);// by the above method we are accesssing the Al as array
System.out.println(al);//
al.removeAll(al1);
System.out.println(al);
al1.clear();
System.out.println(al1);
System.out.println(al1.isEmpty());
	}
}
