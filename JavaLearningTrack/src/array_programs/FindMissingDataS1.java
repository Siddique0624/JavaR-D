package array_programs;

public class FindMissingDataS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[]= {1,2,3,5,6};
		int n=data.length;
		int total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) {
			
			total-=data[i];
		}
		System.out.println("Missing number is "+total);
	}

}
