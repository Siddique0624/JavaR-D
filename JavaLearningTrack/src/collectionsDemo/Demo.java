package collectionsDemo;

import java.util.ArrayList;
public class Demo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
al.add(10);al.add(10.5);al.add(true);al.add('a');al.add("BJS");
System.out.println(al);al.add(2, 60);System.out.println(al);
al.add(600);ArrayList al1=new ArrayList();
al1.add(80);al1.add(90);al1.add(100);
System.out.println(al.addAll(al1));System.out.println(al);
al.addAll(2, al1);
System.out.println(al);System.out.println(al.contains(10));
System.out.println(al.contains(20));
System.out.println(al.containsAll(al1));al.ensureCapacity(20);
System.out.println(al.equals(al1));System.out.println(al.get(2));
System.out.println(al.getClass());
System.out.println(al.indexOf(new Integer(20)));al.trimToSize();
System.out.println(al.isEmpty());
System.out.println(al.lastIndexOf(80));
al.remove(2);System.out.println(al);
al.remove(new Integer(100));System.out.println(al);
al.retainAll(al1);System.out.println(al);
al.set(2, 15);System.out.println(al);System.out.println(al.size());
System.out.println(al.subList(0, 3));
Object a[]=al.toArray();System.out.println(a[2]);
System.out.println(al);al.removeAll(al1);System.out.println(al);
al1.clear();System.out.println(al1);
System.out.println(al1.isEmpty());
	}
}