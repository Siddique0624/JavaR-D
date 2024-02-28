package Exception_programs;
import java.util.Scanner;
import java.lang.*;

class UnderAgeException extends Exception
{
   public String getMessage(){
	return "U R Too young to apply for DL" ;
   }
}

class OverAgeException extends Exception
{
   public String getMessage(){
	return "U R Too old to apply for DL" ;
   }
}
class Applicant
{
  int age;
void acceptInput(){
	System.out.println("Enter the applicant age");
	Scanner scan=new Scanner(System.in);
	 age=scan.nextInt();
}

void verify() throws Exception {
	 
	if( age>=18 && age<=65)
		System.out.println("Process for further application");
	else if(age<18){
		UnderAgeException  uae=new UnderAgeException();
	//	System.out.println(uae.getMessage());
		throw uae;
	}
	else if(age>=65) {
	  OverAgeException  oae=new OverAgeException();
	//	System.out.println(oae.getMessage());
		throw oae;
	}
	else
		System.out.println("U r eligible ");
  }
}

class Rto
{
	void initiate(){
		try{
			Applicant a=new Applicant();
			a.acceptInput();
			a.verify();
		}
		catch(UnderAgeException uae)
		{
		System.out.println(uae.getMessage());	
		}
		catch(OverAgeException oae)
		{
		System.out.println(oae.getMessage());	
		}
		catch(Exception e)
		{
		System.out.println("Not eligible");	
		}
	}
}

class LaunchRto
{
	public static void main(String[] args) 
	{
		 Rto r=new Rto();
		 r.initiate();
	}
}
