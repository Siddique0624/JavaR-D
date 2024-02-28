package Exception_programs;
import java.util.Scanner;

class Exception_program1  
{
	public static void main(String[] args) 
	{
		System.out.println("Connection Established");
   System.out.println("Enter the Numerator");
   Scanner scan=new Scanner (System.in);
   int a=scan.nextInt();
   System.out.println("Enter the Denominator");
   int b=scan.nextInt();
   int c=a/b;
   System.out.println( c);
   System.out.println("Connection Terminated");
 

	}
}
