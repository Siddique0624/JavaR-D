package Exception_programs;
import java.util.Scanner;
class Demo104
{
void fun1(){
			 System.out.println("Enter the Numerator");
   Scanner scan=new Scanner (System.in);
   int a=scan.nextInt();
   System.out.println("Enter the Denominator");
   int b=scan.nextInt();
   int c=a/b;
   System.out.println( c);

		 }
}
class Demo201
{
void fun2(){
	Demo104 d1=new Demo104();
		 d1.fun1();
		 }
}

class Demo301
{
void fun3(){
	Demo201 d2=new Demo201();
		 d2.fun2();
		 }
}
class PropagationofExcption_solution 
{
	public static void main(String[] args) 
	{
		try{
			Demo301 d3=new Demo301();
		 d3.fun3();
	    }
		catch(Exception e){
			System.out.println("Inside Main");
		}
   }
}
