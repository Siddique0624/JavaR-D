import java.util.Scanner;
class Demo1
{
void fun1(){
	System.out.println("Connection is established");
try{
			 System.out.println("Enter the Numerator");
   Scanner scan=new Scanner (System.in);
   int a=scan.nextInt();
   System.out.println("Enter the Denominator");
   int b=scan.nextInt();
   int c=a/b;
   System.out.println( c);
}
catch(Exception e){
	System.out.println("Invalid inputs");
}
	System.out.println("Connection is terminated");
		 }
}
 
class HandlingException_using_trycatch 
{
	public static void main(String[] args) 
	{
		
		 Demo1 d1=new Demo1();
		 d1.fun1();
	    
		 
   }
}
