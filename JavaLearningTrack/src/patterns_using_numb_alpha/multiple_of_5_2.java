package patterns_using_numb_alpha;
import java.util.Scanner;
class multiple_of_5_2

{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	
		for(int i=1;i<=n;i++){
			int count=i;
			for(int j=1;j<=n;j++){
                if(j<n){
				 System.out.print(count+"*"+" ");
                  count=count+n;
				  }
				  else
				{
						 System.out.print(count+" ");
                  count=count+n;	
				}
			}
			System.out.println();
		}
		 }
}
 /*
 
 Enter thenumber of rows
5
1* 6* 11* 16* 21
2* 7* 12* 17* 22
3* 8* 13* 18* 23
4* 9* 14* 19* 24
5* 10* 15* 20* 25
 
 
 */