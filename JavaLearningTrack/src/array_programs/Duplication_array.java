package array_programs;

public class Duplication_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int mobno[]= {8,2,1,7,6,9,0,2,0,4,2,0};  //assigning mob no to mobno array
     int n=mobno.length;//assigning length of the mobile no to n
     System.out.println("Length of the mobile no is "+n);
     for(int i=0;i<n;i++) {   //loop for mobile number from index 0
         for(int j=i+1;j<n;j++) {  //loop for mobile no for the remaining number from index 1 to 9 
        	 if(mobno[i]==mobno[j]) //comparing the 0 index for the remaining index numbers
        		 System.out.println(mobno[j]);
        	 
           }
      }
    }
}
