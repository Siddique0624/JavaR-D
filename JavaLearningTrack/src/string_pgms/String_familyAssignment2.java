package string_pgms;

import java.util.Scanner;

public class String_familyAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,r,c,sum=0;
		System.out.println("Enter the size of array");
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		c=s.nextInt();
		System.out.println("Entre Family memebers name");
		String family[][]=new String[r][c];
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				family[i][j]=s.next();
			} 
		}
		System.out.println("String array of family memebers");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(family[i][j]+" ");
			} 
			System.out.println();
		}
		String s1=family[0][1].concat(family[2][1]);

		String s2=family[1][1].concat(s1);
		System.out.println(s1);
		System.out.println(s2);
		byte array[]=s2.getBytes();
		System.out.println("byte value of S2 is ");
		for(i=0;i<s2.length();i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(i=0;i<s2.length();i++) {
			sum+=array[i];
		}		
    if(sum%2==0) { 
		System.out.println("I love me family");

    }
    else {

		System.out.println("I like me family");
    }
    
		
		
		
	}

}
