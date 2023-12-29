package array_programs;

public class Summation_divisble2n4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Data[] = {42,89,23,90,80,50},sum=0,sum1=0;
		for(int i=0;i<=2;i++)
		{
			System.out.println(Data[i]);
			sum+=Data[i];
		}
           int z=sum;
           System.out.println("1st sum is "+z);
           for(int j=Data.length-1;j>=3;j--)
           {
        	   System.out.println(Data[j]);
        	   sum1+=Data[j];
        	   
           }
		
           int x=sum1;
           System.out.println("2nd sum is "+x);
           int y=x-z;
           System.out.println("Disfference is : "+y);
           if(y%2==0 && y%8==0)
           {
        	   System.out.println("number is divisible by 2 and 8");
           }
           else {

        	   System.out.println("number is not  divisible by 2 and 8");
           }
		
	}

}
