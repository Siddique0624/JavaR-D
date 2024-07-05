package patterns_using_numb_alpha;
import java.util.Scanner;
class Number_with_star_pattern
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				 if(j<n){
               System.out.print(j+"*");
			}
			else{
                  System.out.print(j);
			}
			
	     	}
			System.out.println();
		 }
   }
}
/*

Enter thenumber of rows
5
1*2*3*4*5
1*2*3*4*5
1*2*3*4*5
1*2*3*4*5
1*2*3*4*5

*/