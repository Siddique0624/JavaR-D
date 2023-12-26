package array_programs;

import java.util.Scanner;

public class Bubblesortforshrtrange {

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
     System.out.println("Bubble sort algorithm");
     for(i=0;i<(n-1);i++) {
    	 for(j=0;j<(n-i-1);j++) {
    		 if(bjs[j]>bjs[j+1]) {
    			 temp=bjs[j];
    			 bjs[j]=bjs[j+1];
    			 bjs[j+1]=temp;
    		 }
    	 }
     }
     for(i=0;i<n;i++) {
	System.out.print( bjs[i]+"  ");
     }
	}
}
