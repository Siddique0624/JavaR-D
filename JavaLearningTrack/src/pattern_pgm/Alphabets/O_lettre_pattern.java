 import java.util.Scanner;
class O_lettre_pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
			if( j==n/2&&i>1&&i<n||i==1&&j<n/2&&j>1||i==n&&j<n/2&&j>1||j==1&&i>1&&i<n){
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


 