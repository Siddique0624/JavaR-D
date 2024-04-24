package patterns_using_numb_alpha;
import java.util.Scanner;
class DecendingNumbers_in_square
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	int c=n*n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(c+" ");
				c--;
			}
			System.out.println();
		}
		 }
}

/*
Enter thenumber of rows
5
25 24 23 22 21
20 19 18 17 16
15 14 13 12 11
10 9 8 7 6
5 4 3 2 1
*/