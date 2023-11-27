package array_programs;

import java.util.Scanner;

public class Enhanced_assinment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		   float sum=0;
		   System.out.println("Enter the number of subjects");
		   Scanner s=new Scanner(System.in);
		   int n=s.nextInt();
		   int Semester[]=new int[n];
		   for(int i=0;i<=Semester.length-1;i++) {
			   
			   Semester[i]=s.nextInt();
			   sum+=Semester[i];
		   }
		   
			System.out.println("Total marks are "+sum);
			
				float percentage=(sum/(n*100))*100;
				System.out.println("average od=f semester marks is"+percentage);

			
				
 
	}

}
