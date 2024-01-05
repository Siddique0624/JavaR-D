package string_pgms;


import java.util.Scanner;

public class Separating_the_tokens_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		int len=s.length();
		int quote[]=new int[s.length()];
		int k=0;
		int count=0;//to track how many times its there
		String res[]=new String[s.length()];
		String temp="";
for(int i=0;i<=len-1;i++)
{
	if(s.charAt(i)=='"')
	{
		quote[k]=i;
		k++;
		count++;
	}
}
int n=0,count1=0,z=0;
for(int i=0;i<=len-1;i++)
{
	if(s.charAt(i)!=' ' && s.charAt(i)!='"')
		temp=temp+s.charAt(i);
	else if(s.charAt(i)=='"' )
	{
		for(int j=quote[n];j<=quote[n+1];j++)
		{
			temp=temp+s.charAt(j);
		}
			i=quote[n+1]+1;
			n=n+2;
			res[z]=temp;
			z++;
            count1++;
			temp="";
	}
	else
	{
		res[z]=temp;
		z++;
		temp="";
		count1++;
	}
}

res[z]=temp;
		z++;
		temp="";
		count1++;

for(int i=0;i<=count1-1;i++)
{
	System.out.println(res[i]);
}
	}

}
 
 /*
 enter the string
xyz abc "token program" asd
xyz
abc
"token program"
asd
 */