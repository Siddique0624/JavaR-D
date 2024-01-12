package array_programs;

import java.util.Scanner;
class Copying_array
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
 
         int i,n;
 
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int a[]  = new int[n];
 int res[]=new int[n];

 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     { 
         a[i] = sc.nextInt();
     }
 
     	System.out.println("Original array");
     for(i=0;i<n;i++)
     {
         System.out.print(a[i]+" ");
     }

System.out.println();
      for ( i=0;i<=a.length-1 ;i++ )
      {
		  res[i]=a[i];
      }
 
      System.out.println("Coppied Array");
     for(i=0;i<n;i++)
     {
       System.out.print(res[i]+" ");
     }
 } 
}

