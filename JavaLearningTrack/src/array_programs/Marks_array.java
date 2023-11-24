package array_programs;

import java.util.Scanner;

public class Marks_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   float sum=0;
   System.out.println("Enter the number of subjects");
   Scanner s=new Scanner(System.in);

   int n=s.nextInt();
   int Semester[]=new int[n];

   System.out.println("Enter the marks in each subject");
   for(int i=0;i<=Semester.length-1;i++) {
	   
	   Semester[i]=s.nextInt();
	   sum+=Semester[i];
   }
		float average=sum/n;
		System.out.println("average od=f semester marks is"+average);
		
		
	}

}
