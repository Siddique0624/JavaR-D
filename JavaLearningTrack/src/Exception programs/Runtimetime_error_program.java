class Demo
{
	void fun(){
		fun();
	}
}


class  Runtimetime_error_program
{
	public static void main(String[] args) 
	{
		 Demo d=new Demo();
		 d.fun();

		 }
}
