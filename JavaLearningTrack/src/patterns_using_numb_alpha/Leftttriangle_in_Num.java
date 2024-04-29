package patterns_using_numb_alpha;
import java.util.Scanner;
class Leftttriangle_in_Num 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
			System.out.print(j+ " ");
			
			} 
			System.out.println();
		
			
			}/*

			for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
			System.out.print(j+" ");
			
			} 
			System.out.println();
		
			
			}*/
		
		}
}
 
/*
Enter thenumber of rows
5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 Enter thenumber of rows
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/