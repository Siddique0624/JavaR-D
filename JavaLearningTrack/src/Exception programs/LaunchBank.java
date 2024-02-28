import java.util.Scanner;
class InvalidCustomException extends Exception// make class and make invalid custome exception as parent class
{
   public String getMessage(){
	return "invalid inputs" ;
   }
}

class Atm
{
  int userid=1111;
  int pwd=2222;
 int uid,pass;
void acceptInput(){
	System.out.println("Enter the user id ");
	Scanner scan=new Scanner(System.in);
	int uid=scan.nextInt();
    System.out.println("Enter the password ");
	int pass=scan.nextInt();
}
void verify() throws Exception{
	 
	if(userid==uid && pwd==pass)
		System.out.println("Collect your cash");
	else{
		InvalidCustomException  ice=new InvalidCustomException();
	//	System.out.println(ice.getMessage());
		throw ice;
	}
}

}


class Bank
{
	void initiate() throws Exception{
		try{
			Atm a=new Atm();
			a.acceptInput();
			a.verify();
		}
		catch(InvalidCustomException ice )
		{
		System.out.println(ice.getMessage());	
		}
		catch(Exception e){
		System.out.println( "invalid inputs entered");	
		}
	}
}

class LaunchBank	
{
	public static void main (String[] args) 
	{
		 Bank b=new Bank();
		 try{
			b.initiate();
		 }
		 catch(Exception e){
			
		System.out.println( "invalid inputs entered");
		 }
	}
}
