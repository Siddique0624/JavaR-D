import java.util.Scanner;
class Q_lettre_pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			if(i==0 && j<=(3*n)/4||j==0 && i<=(3*n)/4||	i==(3*n)/4 && j<=(3*n)/4||j==(3*n/4)&&i<=(3*n)/4||i==j && i>=n/2){
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