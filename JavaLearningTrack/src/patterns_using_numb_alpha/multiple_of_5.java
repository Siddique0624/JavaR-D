package patterns_using_numb_alpha;
import java.util.Scanner;
class multiple_of_5

{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	
		for(int i=1;i<=n;i++){
			int count=n*i;
			for(int j=1;j<=n;j++){

				 System.out.print(count+" ");
                  count--;
			}
			System.out.println();
		}
		 } 
}
/*
Enter thenumber of rows
5
5 4 3 2 1
10 9 8 7 6
15 14 13 12 11
20 19 18 17 16
25 24 23 22 21

*/