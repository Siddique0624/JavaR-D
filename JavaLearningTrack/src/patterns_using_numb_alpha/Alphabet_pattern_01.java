package patterns_using_numb_alpha;
import java.util.Scanner;
 
class Alphabet_pattern_01
{            
    public static void main(String[] args)
    {

		 System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
        int alphabet = 65;
                for (int i = 0; i <= n-1; i++)
        {
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
5
A
A B
A B C
A B C D
A B C D E
A B C D E F



*/