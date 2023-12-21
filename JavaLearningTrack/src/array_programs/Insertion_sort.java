package array_programs;

import java.util.Scanner;
class Insertion_sort
{
   public static void main( String args[] ) {
     int n,temp,j,i;
    System.out.println("enter the size of array");
    Scanner x=new Scanner(System.in);
    n=x.nextInt();
    int a[]=new int[n];
    System.out.println("entre the data of array");
    for( i=0;i<n;i++) {
   	 a[i]=x.nextInt();
    }

for( i=1;i<a.length;i++){
		temp=a[i];
        j = i;    
       while(j > 0 && a[j-1]>temp)
		{

         
         a[j] = a[j-1];
         j = j-1; 
       }       
        a[j]=temp;
}

System.out.println("Sorting using insertion sort");
       for( i=0;i<a.length;++i){
         System.out.print(a[i] + " ");
       
           }
}
}
