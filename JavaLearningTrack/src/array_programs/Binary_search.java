package array_programs;

import java.util.Scanner;

public class Binary_search {

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
    int l=0;   
    int n=a.length;
    int h=n-1;
     int mid=(l+h)/2;
     int pos=0;
    for(int i=0;i<=a.length-1;i++) {
    	 if(a[mid]==key) {
    		 System.out.println("position of search element "+mid);
    		 pos=i;
    		 break;
    		 }
    	 else if (a[mid]<key) {
    		 l=mid+1;
    		 }
    	 else {
    		 h=mid-1;
    		 }
    	 mid=(l+h)/2;
    	 }
     if(l>h) {
    	 System.out.println("Given key is not found in the array");
     }
	}

}