package string_pgms;

import java.util.Scanner;
class Case_changing_the_String 
{
	public static void main(String[] args) 
	{

		System.out.println("Enter the String");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String u="";
		for (int i=0;i<=s.length()-1 ;i++)
		{ 
			if (s.charAt(i)>=65 && s.charAt(i)<=90  )//to check the capital letters and interchange to small letters
			{
				u=u+(char)(s.charAt(i)+32);
			}
			else if (s.charAt(i)>=97 && s.charAt(i)<=122 )
			{
					u=u+(char)(s.charAt(i)-32);
			}
		}
		System.out.println( "The given string is "+s);

		System.out.println( "The Case changed String is  "+u);
         
	}

}

/*
Enter the String
NAVeen
The given string is NAVeen
The Case changed String is  navEEN
*/
