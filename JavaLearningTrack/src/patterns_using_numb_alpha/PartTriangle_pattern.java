package patterns_using_numb_alpha;

import java.util.Scanner;

public class PartTriangle_pattern {

		public static void main(String[] args) 
		{
			
			System.out.println("Enter the number of rows");
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		    int c=1,c1=10; 
			  for (int i=1;i<=n;i++)
			 { 
			for (int j=1;j<=i;j++)
				 {
				     		System.out.print(" ");

				 }
				 for (int k=1;k<=i;k++)
				 {
				     		System.out.print(c);
							c++;
				 }
				 
				 for (int k=1;k<=i;k++)
				 {
				     		System.out.print(c1);
							c1--;
				 }
				 	 System.out.println();

			 }
			 
		}
	}
//TO be executed in editplus only for proper output viewing