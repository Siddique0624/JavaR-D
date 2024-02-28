import java.util.Scanner;
class C_lettre_pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			if(/*upper row with 1st cut*/i==1&&j<n/2&&j>1||/*lower row with 1st cut*/i==n&&j<n/2&&j>1||j==1&&i>1/*for above cutting*/&&i<n/*for bolw cutting*/){
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


//i==1&&j<n/2&&j>1||i==n/2&&j<=n/2||j==1&&i>1||j==n/2&&i>1
//j==n/2&&i>1&&i<n/2||j==n/2&&i>n/2&&i<n||j==1||i==n/2&&j<n/2||i==1&&j<n/2||i==n&&j<n/2