import java.util.Scanner;
class X_letter
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
			if( i+j==n||i==j){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
			System.out.println();
		
			
			}
		}
}

 