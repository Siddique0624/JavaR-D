package patterns_using_numb_alpha;
import java.util.Scanner;
class Number_pattern5 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
			if( j%2!=0){
				System.out.print("1");
			}
			else{
			System.out.print("0"); 
				
			}
		}
			 
			System.out.println();
		
			
			}
		}
}
 /*
 
 Enter thenumber of rows
5
010101
010101
010101
010101
010101
010101
 
 */