package string_pgms;

import java.util.Scanner;
class vowels_program_with_specialCharacters
{
	 
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
	   int len=s.length();
       int vcount=0;
	   int ccount=0;
	   int scount=0;

	   for (int i=0;i<=s.length()-1 ;i++ )
	   {
		   if (s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
		   {
             if ( s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
             {
				 vcount++;
             }
			 else
			   {
				 ccount++;
			   }
	   }
	   else
	        scount++;
	   }


		System.out.println("Total count of vowels " +vcount);

		System.out.println("Total count of constant " +ccount);
		
		System.out.println("Total count of spacial chars " +scount);
	}
}
