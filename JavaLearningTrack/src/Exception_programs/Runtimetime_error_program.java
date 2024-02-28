package Exception_programs;
class Demo105
{
	void fun(){
		fun();
	}
}


class  Runtimetime_error_program
{
	public static void main(String[] args) 
	{
		Demo105 d=new Demo105();
		 d.fun();

		 }
}
