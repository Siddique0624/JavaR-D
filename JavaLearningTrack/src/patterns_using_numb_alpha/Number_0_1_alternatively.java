package patterns_using_numb_alpha;
import java.util.Scanner;
class multiplesof5
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){

				 System.out.print((i+j)%2);
			}
			System.out.println();
		}
		 }
}
/*

Enter thenumber of rows
5
01010
10101
01010
10101
01010


*/