package patterns_using_numb_alpha;

 import java.util.Scanner;

class  different_value_Pattrn
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		 for (int i=1;i<=n;i++)
		 {    
			 if(i%2==0)//to print the value at j=1 at even places of i as per pattern
			 System.out.print(i+1);
			 
			 for (int j=1;j<=n-1;j++)
			 {
                 System.out.print(i);
			 }
			  if(i%2!=0)
			 System.out.print(i+1);
			 	 System.out.println();

		 }
		 
			}
}

//to undrstand better go line by line
/*
Enter thenumber of rows
5
11112
32222
33334
54444
55556
*/