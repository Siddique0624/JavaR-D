package string_pgms;


import java.util.Scanner;
//Not working
public class Separating_the_tokens_String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		int len=s.length();
		int quote[]=new int[s.length()];
		int k=0;
		int count=0; 
		String res[]=new String[s.length()];
		String temp="";

int n=0;
for(int i=0;i<=len-1;i++)
{
	if(s.charAt(i)!=' ')
		temp=temp+s.charAt(i);
	else
	{
		res[k]=temp;
		k++;
		temp="";
		count++;
	}        
}res[k]=temp;
		k++;
		temp="";
		count++;


for(int i=0;i<=count-1;i++)
{
	System.out.println(res[i]);
}
	}

}
