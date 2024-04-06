package patterns_using_numb_alpha;
import java.util.Scanner;
 
class Alphabet_pattern_Kshape_03
{            
    public static void main(String[] args)
    {

		 System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
        int alphabet = 65;
      
		for (int i=0;i<=n ;i++ )
		{
			
			for (int j = n; j >= i; j--)
            {
                System.out.print((char) (alphabet + j) + " ");//here alphabet is 65 and will keep on increasing with respect to J
            }
			            System.out.println();

		}
    }
}

/*

Enter thenumber of rows
5
F E D C B A
F E D C B
F E D C
F E D
F E
F

*/