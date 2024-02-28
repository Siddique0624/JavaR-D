import java.util.Scanner;

class Exception_program2  
{
	public static void main(String[] args) 
	{
		System.out.println("Connection Established");
		try{
   System.out.println("Enter the Numerator");
   Scanner scan=new Scanner (System.in);
   int a=scan.nextInt();
   System.out.println("Enter the Denominator");
   int b=scan.nextInt();
   int c=a/b;
   System.out.println( c);

   System.out.println( "Enter the  size of an array");
   int size=scan.nextInt();
   int arr[]=new int [size];
   System.out.println( "Enter the  element to be stored ");
   int element=scan.nextInt();
   System.out.println( " entered the position to be place the element ");
   int pos=scan.nextInt();
   arr[pos]=element;
   }
		catch(Exception e )
			{
   System.out.println(" Enter Valid input");
		}
System.out.println("Connection Terminated");
	}
}
