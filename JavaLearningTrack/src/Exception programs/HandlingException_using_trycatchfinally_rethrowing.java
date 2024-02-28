import java.util.Scanner;
class Demo1
{
void fun1() throws Exception{
	System.out.println("Connection2 is established");
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
	throw e;
}

finally{
	System.out.println("Connection2 is terminated");
        }
    }
}
 
class HandlingException_using_trycatchfinally_rethrowing 
{
	public static void main(String[] args) 
	{
		
	System.out.println("Connection1 is established");
		try{ Demo1 d1=new Demo1();
		 d1.fun1();
	    }
		catch(Exception e){
			
	System.out.println("Invalid main");
		}
		
	System.out.println("Connection1 is terminated");
		 
   }
}
