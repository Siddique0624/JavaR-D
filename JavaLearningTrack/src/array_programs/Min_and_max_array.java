package array_programs;

public class Min_and_max_array {

	 static void min(int data[]) {
		int min=data[0];
		
		for(int i =1;i<data.length;i++) {
			if(min>data[i]) {
				min=data[i];
			}
		}
		System.out.println(min);
	}

	 static void max(int data[]) {
		int max=data[0];
		
		for(int i =1;i<data.length;i++) {
			if(max<data[i]) {
				max=data[i];
			}
		}
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int  bjs[]={22,55,66,44,11,};
   min(bjs);
   max(bjs);
	}

}
