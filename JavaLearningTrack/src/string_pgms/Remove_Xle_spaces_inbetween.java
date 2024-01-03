package string_pgms;

import java.util.Scanner;
class  Remove_Xle_spaces_inbetween 
{
	public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter teh String");              
         String s=scan.nextLine();
		 String res ="";
		 for (int i=0;i<s.length() ;i++ )
		 {
			 if(s.charAt(i)!=' '){
				res = res + s.charAt(i);
			 }
		else if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){// difference between removing every space pgm is it i insteat of (i+1)
				res = res + s.charAt(i);
			 }
		 }
	 System.out.println(res);


	}
}

