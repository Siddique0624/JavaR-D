package array_programs;

import java.util.Scanner;

public class TakeUserinputsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n;
       System.out.println("Enter the value of array");
       Scanner x=new Scanner(System.in);
       n=x.nextInt();
       int marks[]=new int [n];
       System.out.println("Enter the value of arrays one by one");
       for(int i=0;i<n;i++) {
    	   marks[i]=x.nextInt();
       }
       
 	}

}
