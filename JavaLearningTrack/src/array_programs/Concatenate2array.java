package array_programs;

public class Concatenate2array {
	   public static void main(String[] args) {
	      int[]a = {1,2,3,4};
	      int[]b = {4,16,1,2,3,22};
	      int[]c = new int[a.length+b.length];
		   int[]d = new int[b.length+a.length];
	      int count = 0,count1=0;

	      for(int i = 0; i<a.length; i++) {
	         c[i] = a[i];
	         count++;
	      }

	      for(int j = 0;j<b.length;j++) {
	         c[count++] = b[j];
	      }
	       
			 
	      for(int i = 0; i<b.length; i++) {
	         d[i] = b[i];
	         count1++;
	      }

	      for(int j = 0;j<a.length;j++) {
	         d[count1++] = a[j];
	      }
			 
			 
			 for(int i = 0;i<a.length;i++)
			  System.out.print(a[i]+" ");
	     
		 System.out.println();


	    for(int i = 0;i<b.length;i++)
			  System.out.print(b[i]+" ");
	   	 System.out.println();


	      for(int i = 0;i<c.length;i++)
			  System.out.print(c[i]+" ");

		 System.out.println();
		     for(int i = 0;i<d.length;i++)
			  System.out.print(d[i]+" ");
	   }
	}