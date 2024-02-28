class Demo
{
	void fun()
	{
		
	}
}
class NullPointerException_pgm{
	public static void main(String[] args) 
	{
	 Demo d=new Demo();
	 d.fun();
	 d=null;
	 d.fun();
	 }
}
