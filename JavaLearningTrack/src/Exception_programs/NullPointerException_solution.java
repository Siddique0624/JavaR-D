package Exception_programs;
class Demo102
{
	void fun()
	{
		
	}
}
class NullPointerException_solution{
	public static void main(String[] args) 
	{
		try{
			Demo102 d=new Demo102();
	 d.fun();
	 d=null;
	 d.fun();
	 }
	 catch(Exception e){
		System.out.println("Invalid references");
	 }



	}}
