import java.util.Scanner;
class Demo1
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
class Demo2
{
void fun2(){
		 Demo1 d1=new Demo1();
		 d1.fun1();
		 }
}

class Demo3
{
void fun3(){
		 Demo2 d2=new Demo2();
		 d2.fun2();
		 }
}
class PropagationofExcption_solution 
{
	public static void main(String[] args) 
	{
		try{
		 Demo3 d3=new Demo3();
		 d3.fun3();
	    }
		catch(Exception e){
			System.out.println("Inside Main");
		}
   }
}
