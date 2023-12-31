package string_pgms;

public class Alternate_string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Vikram Sarabhai Space Research Centre";
		System.out.println(s.concat("@gmail.com"));
		System.out.println(s.charAt(2) );
		System.out.println(s.indexOf("V"));
		System.out.println(s.lastIndexOf("r"));
		System.out.println(s.isEmpty());
		System.out.println(s.endsWith("re"));
		System.out.println(s.join("/", "Vikram","Sarabhai","Space","Research","Centre"));
		String s1="           Vikram Sarabhai Space Research Centre        ";
		System.out.println(s1.trim());
        byte array[]=s.getBytes();
        for (int i=0;i<array.length;i++) {
        	System.out.println(array[i]);
        }
		System.out.println("Alternate String is ");
		int i = 0;
		do {
			 
			System.out.println(s.charAt(i));
			i+=2;
		}
		while(i<s.length());
		
		

	}

}

