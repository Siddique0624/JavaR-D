package array_programs;


import java.util.Scanner;

public class SelectionSort2pattern {
	
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
     
     int min=0; int k=0;
     System.out.println("Selection sort algorithm");
     for(i=0;i<n ;i++) {
    	 min=bjs[i];
    	 k=i;
    	
    	 for(j=i+1;j<n  ;j++) {
    		 if(bjs[j]<min) {
                 min=bjs[j];
                 k=j;
                }
    		
    		 }
    	 temp=bjs[i];
		 bjs[i]=bjs[k];
		 bjs[k]=temp;
    	
     }
     for(i=0;i<n;i++) {
	System.out.print(bjs[i]+" ");
     }
	}
}


 