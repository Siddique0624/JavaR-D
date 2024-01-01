package string_pgms;

import java.util.Scanner;
class Pallindrome_in_String 
{
	public static void main(String[] args) 
	{

		System.out.println("Enter the String");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String p=s.toLowerCase();//string is being converted to lowercase to maintain equality 
		String u="";
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			u=u+p.charAt(i);
		}
		if(u.equals(p)){//comparing to methods using equals method
			System.out.println("the given String is a pallindrome");
		}
		else{
					System.out.println("the given String is not a pallindrome");
		}
	}

}
/*
Enter the String
Malayalam
the given String is a pallindrome 
*/