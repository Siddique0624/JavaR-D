package array_programs;

public class Array_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numbers[]= {198,201,303,404,544,786,909};
	     for(int i=0;i<numbers.length;i++) {
	    	 
	    	 int temp=numbers[i];
	    	 int rev=0;
	    	 int rem=0;
	    	 while(temp>0)
	    	 {
	    		 rem=temp%10;
	    		 rev=rev*10+rem;
	    		 temp=temp/10;
	    	 }
	    	 if(numbers[i]==rev)
	    	 {
	    		 System.out.println("Palindrome number is "+numbers[i]);
	    	 }
	     }
	     
	}

}
