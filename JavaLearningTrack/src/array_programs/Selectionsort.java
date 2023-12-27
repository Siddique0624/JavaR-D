package array_programs;

import java.util.Scanner;

public class Selectionsort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,i,j,temp;
     System.out.println("enter the size of array");
     Scanner x=new Scanner(System.in);
     n=x.nextInt();
     int bjs[]=new int[n];
     System.out.println("entre the data of array");
     for(i=0;i<n;i++) {
    	 bjs[i]=x.nextInt();
     }
     System.out.println("Selection sort algorithm");
     for(i=0;i<n;i++) {
    	 for(j=i+1;j<n;j++) {
    		 if(bjs[i]>bjs[j]) {
    			 temp=bjs[i];
    			 bjs[i]=bjs[j];
    			 bjs[j]=temp;
    		 }
    	 }
     }
     for(i=0;i<n;i++) {
	System.out.print(bjs[i]+" ");
     }
	}
}
