package patterns_using_numb_alpha;
        
 import java.util.Scanner;

class  Decreasing_Triangle_Pattrn
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	    int c=1; 
		int  d=1;
		 for (int i=1;i<=n;i++)
		 { 
			 c=i*(i+1)/2;//1
		for (int j=1;j<=i;j++)
			 {
			     if(i%2==0){
                 System.out.print(c-j+1);
				  d=c+1;
				 }
				 else{  
					 System.out.print(d+j-1);
				 }
			 }
			   
			 	 System.out.println();

		 }
		 
	}
}
/*
Enter thenumber of rows
5
1
32
456
10987
1112131415*/