package array_programs;

public class Transpose_of_matrix_2d_array {

	 	 public static void main(String args[]){
	      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	      int b[][] = new int[3][3];
	      System.out.println("Given matrix ");

	      for(int i = 0;i<3;i++){
	         for(int j = 0;j<3;j++){
	            System.out.print(a[i][j]+" ");
	         }
	         System.out.println();
	      }
	      System.out.println("Matrix after transpose");

	      for(int i = 0;i<3;i++){
	         for(int j = 0;j<3;j++){
	            //b[i][j] = 0;
	            for(int k = 0;k<3;k++){
	               b[i][j]=a[j][i];
	            }
	            System.out.print(b[i][j]+" ");
	         }
	         System.out.println();
	      }
	   }
	} 















	/*
	 

		public static void main(String[] args) 
		{
		int ar[][]={{1,2,3},{4,5,6,},{7,8,9}};
		int br[][]=new int[3][3];
		for (int i=0;i<=ar.length-1;i++ )
		{
			
		for (int j=0;j<=ar.length-1;i++ ){
		      br[i][j]=ar[j][i];
		     }
		}
		for (int i=0;i<=ar.length-1;i++ )
		{
			
		for (int j=0;j<=ar.length-1;i++ ){
		   System.out.print( br[i][j]);
		     }
			 
		   System.out.println();
		}		
				
		}
	}
	*/