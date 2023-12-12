package array_programs;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {//it will work only fpr sorted array
		// TODO Auto-generated method stub
    System.out.println("Enter the number of elements in teh array");
    Scanner scan=new Scanner(System.in);
    int m=scan.nextInt();
    int a[]=new int[m];
    for(int i=0;i<=m-1;i++) {
        System.out.println("Enter the "+(i+1)+" elements in the array");
        a[i]=scan.nextInt();
    }

    System.out.println("enter the key to be searched");
    int key=scan.nextInt();
   int pos=0;
   for(int i=0;i<=a.length-1;i++) {
	   if(a[i]==key) {
		   pos=i;
		   break;
	   }
	   else {
		   pos=-1;
	   }
   }
    if(pos<0) {

        System.out.println("key "+key+" Not found in given array");    	
    }
    else {


        System.out.println("key "+key+" is found at the "+pos +" position ");  
    }
    
	}

}