package patterns_using_numb_alpha;
import java.util.Scanner;
 
class Alphabet_pattern_06
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
                System.out.print(" ");//here alphabet is 65 and will keep on increasing with respect to J
            }
		 	
			for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");//here alphabet is 65 and will keep on increasing with respect to J
            }
			            System.out.println();
		}
	
	}
}


/*

Enter thenumber of rows
10
           A
          A B
         A B C
        A B C D
       A B C D E
      A B C D E F
     A B C D E F G
    A B C D E F G H
   A B C D E F G H I
  A B C D E F G H I J
 A B C D E F G H I J K

*/