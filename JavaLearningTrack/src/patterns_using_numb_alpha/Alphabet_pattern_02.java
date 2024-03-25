package patterns_using_numb_alpha;
import java.util.Scanner;
 
class Alphabet_pattern_02
{            
    public static void main(String[] args)
    {

		 System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
        int alphabet = 65;
                for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet ) + " ");//here alphabet is 65 and will keep on increasing with respect to J
               //alphabet++; 
			}
		alphabet++;
            System.out.println();
        }
    }
}


/*
if alphabet is increamented outside the loop

Enter thenumber of rows
6
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G

*/

/* 
if alphabet is increamented inside the loop
Enter thenumber of rows
6
A
B C
D E F
G H I J
K L M N O
P Q R S T U
V W X Y Z [ \
*/