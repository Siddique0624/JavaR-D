package Exception_programs;
import java.util.Scanner;
class Demo1
{
void fun1() throws Exception{ 

   System.out.println("Enter the Numerator");
   Scanner scan=new Scanner (System.in);
   int a=scan.nextInt();
   System.out.println("Enter the Denominator");
   int b=scan.nextInt();
   int c=a/b;
   System.out.println( c);
  		 }
}
 
class HandlingException_using_Ducking
{
	public static void main(String[] args) 
	{
		   System.out.println("Connection is established");
try{
		 Demo1 d1=new Demo1();
		 d1.fun1();
}
catch(Exception e){
	   System.out.println("Invalid inputs");
}
   System.out.println("Connection is terminated");

		 
   }
}
